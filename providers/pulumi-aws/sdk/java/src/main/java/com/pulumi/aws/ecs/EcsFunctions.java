// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecs.inputs.GetClusterArgs;
import com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs;
import com.pulumi.aws.ecs.inputs.GetServiceArgs;
import com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs;
import com.pulumi.aws.ecs.outputs.GetClusterResult;
import com.pulumi.aws.ecs.outputs.GetContainerDefinitionResult;
import com.pulumi.aws.ecs.outputs.GetServiceResult;
import com.pulumi.aws.ecs.outputs.GetTaskDefinitionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EcsFunctions {
    /**
     * The ECS Cluster data source allows access to details of a specific
     * cluster within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ecs-mongo = Output.of(EcsFunctions.getCluster(GetClusterArgs.builder()
     *             .clusterName(&#34;ecs-mongo-production&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * The ECS Cluster data source allows access to details of a specific
     * cluster within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ecs-mongo = Output.of(EcsFunctions.getCluster(GetClusterArgs.builder()
     *             .clusterName(&#34;ecs-mongo-production&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getCluster:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS container definition data source allows access to details of
     * a specific container within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ecs-mongo = Output.of(EcsFunctions.getContainerDefinition(GetContainerDefinitionArgs.builder()
     *             .taskDefinition(aws_ecs_task_definition.getMongo().getId())
     *             .containerName(&#34;mongodb&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetContainerDefinitionResult> getContainerDefinition(GetContainerDefinitionArgs args) {
        return getContainerDefinition(args, InvokeOptions.Empty);
    }
    /**
     * The ECS container definition data source allows access to details of
     * a specific container within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ecs-mongo = Output.of(EcsFunctions.getContainerDefinition(GetContainerDefinitionArgs.builder()
     *             .taskDefinition(aws_ecs_task_definition.getMongo().getId())
     *             .containerName(&#34;mongodb&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetContainerDefinitionResult> getContainerDefinition(GetContainerDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getContainerDefinition:getContainerDefinition", TypeShape.of(GetContainerDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS Service data source allows access to details of a specific
     * Service within a AWS ECS Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(EcsFunctions.getService(GetServiceArgs.builder()
     *             .serviceName(&#34;example&#34;)
     *             .clusterArn(data.getAws_ecs_cluster().getExample().getArn())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * The ECS Service data source allows access to details of a specific
     * Service within a AWS ECS Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(EcsFunctions.getService(GetServiceArgs.builder()
     *             .serviceName(&#34;example&#34;)
     *             .clusterArn(data.getAws_ecs_cluster().getExample().getArn())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS task definition data source allows access to details of
     * a specific AWS ECS task definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var mongoTaskDefinition = Output.of(EcsFunctions.getTaskDefinition(GetTaskDefinitionArgs.builder()
     *             .taskDefinition(mongoEcs / taskDefinitionTaskDefinition.getFamily())
     *             .build()));
     * 
     *         var foo = new Cluster(&#34;foo&#34;);
     * 
     *         var mongoEcs_taskDefinitionTaskDefinition = new TaskDefinition(&#34;mongoEcs/taskDefinitionTaskDefinition&#34;, TaskDefinitionArgs.builder()        
     *             .family(&#34;mongodb&#34;)
     *             .containerDefinitions(&#34;&#34;&#34;
     * [
     *   {
     *     &#34;cpu&#34;: 128,
     *     &#34;environment&#34;: [{
     *       &#34;name&#34;: &#34;SECRET&#34;,
     *       &#34;value&#34;: &#34;KEY&#34;
     *     }],
     *     &#34;essential&#34;: true,
     *     &#34;image&#34;: &#34;mongo:latest&#34;,
     *     &#34;memory&#34;: 128,
     *     &#34;memoryReservation&#34;: 64,
     *     &#34;name&#34;: &#34;mongodb&#34;
     *   }
     * ]
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         var mongoService = new Service(&#34;mongoService&#34;, ServiceArgs.builder()        
     *             .cluster(foo.getId())
     *             .desiredCount(2)
     *             .taskDefinition(mongoEcs / taskDefinitionTaskDefinition.getArn())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTaskDefinitionResult> getTaskDefinition(GetTaskDefinitionArgs args) {
        return getTaskDefinition(args, InvokeOptions.Empty);
    }
    /**
     * The ECS task definition data source allows access to details of
     * a specific AWS ECS task definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var mongoTaskDefinition = Output.of(EcsFunctions.getTaskDefinition(GetTaskDefinitionArgs.builder()
     *             .taskDefinition(mongoEcs / taskDefinitionTaskDefinition.getFamily())
     *             .build()));
     * 
     *         var foo = new Cluster(&#34;foo&#34;);
     * 
     *         var mongoEcs_taskDefinitionTaskDefinition = new TaskDefinition(&#34;mongoEcs/taskDefinitionTaskDefinition&#34;, TaskDefinitionArgs.builder()        
     *             .family(&#34;mongodb&#34;)
     *             .containerDefinitions(&#34;&#34;&#34;
     * [
     *   {
     *     &#34;cpu&#34;: 128,
     *     &#34;environment&#34;: [{
     *       &#34;name&#34;: &#34;SECRET&#34;,
     *       &#34;value&#34;: &#34;KEY&#34;
     *     }],
     *     &#34;essential&#34;: true,
     *     &#34;image&#34;: &#34;mongo:latest&#34;,
     *     &#34;memory&#34;: 128,
     *     &#34;memoryReservation&#34;: 64,
     *     &#34;name&#34;: &#34;mongodb&#34;
     *   }
     * ]
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         var mongoService = new Service(&#34;mongoService&#34;, ServiceArgs.builder()        
     *             .cluster(foo.getId())
     *             .desiredCount(2)
     *             .taskDefinition(mongoEcs / taskDefinitionTaskDefinition.getArn())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTaskDefinitionResult> getTaskDefinition(GetTaskDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getTaskDefinition:getTaskDefinition", TypeShape.of(GetTaskDefinitionResult.class), args, Utilities.withVersion(options));
    }
}
