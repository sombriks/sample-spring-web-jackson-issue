package io.github.sombriks.sample;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.utility.DockerImageName;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IssueApplicationTests {

    // FIXME not working with daemonless podman
    final MongoDBContainer mongoDBContainer = new MongoDBContainer(DockerImageName.parse("mongo:latest"));

    @BeforeAll
    public void setup() {
        mongoDBContainer.start();
    }

    @AfterAll
    public void tearDown() {
        mongoDBContainer.stop();
    }

    @Test
    void contextLoads() {
    }

}
