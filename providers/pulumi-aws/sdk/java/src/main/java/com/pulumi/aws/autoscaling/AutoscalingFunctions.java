// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.autoscaling.inputs.GetAmiIdsArgs;
import com.pulumi.aws.autoscaling.inputs.GetGroupArgs;
import com.pulumi.aws.autoscaling.outputs.GetAmiIdsResult;
import com.pulumi.aws.autoscaling.outputs.GetGroupResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AutoscalingFunctions {
    /**
     * The Autoscaling Groups data source allows access to the list of AWS
     * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
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
     *         final var groups = Output.of(AutoscalingFunctions.getAmiIds(GetAmiIdsArgs.builder()
     *             .filters(            
     *                 GetAmiIdsFilter.builder()
     *                     .name(&#34;tag:Team&#34;)
     *                     .values(&#34;Pets&#34;)
     *                     .build(),
     *                 GetAmiIdsFilter.builder()
     *                     .name(&#34;tag-key&#34;)
     *                     .values(&#34;Environment&#34;)
     *                     .build())
     *             .build()));
     * 
     *         var slackNotifications = new Notification(&#34;slackNotifications&#34;, NotificationArgs.builder()        
     *             .groupNames(groups.apply(getAmiIdsResult -&gt; getAmiIdsResult.getNames()))
     *             .notifications(            
     *                 &#34;autoscaling:EC2_INSTANCE_LAUNCH&#34;,
     *                 &#34;autoscaling:EC2_INSTANCE_TERMINATE&#34;,
     *                 &#34;autoscaling:EC2_INSTANCE_LAUNCH_ERROR&#34;,
     *                 &#34;autoscaling:EC2_INSTANCE_TERMINATE_ERROR&#34;)
     *             .topicArn(&#34;TOPIC ARN&#34;)
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAmiIdsResult> getAmiIds() {
        return getAmiIds(GetAmiIdsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The Autoscaling Groups data source allows access to the list of AWS
     * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
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
     *         final var groups = Output.of(AutoscalingFunctions.getAmiIds(GetAmiIdsArgs.builder()
     *             .filters(            
     *                 GetAmiIdsFilter.builder()
     *                     .name(&#34;tag:Team&#34;)
     *                     .values(&#34;Pets&#34;)
     *                     .build(),
     *                 GetAmiIdsFilter.builder()
     *                     .name(&#34;tag-key&#34;)
     *                     .values(&#34;Environment&#34;)
     *                     .build())
     *             .build()));
     * 
     *         var slackNotifications = new Notification(&#34;slackNotifications&#34;, NotificationArgs.builder()        
     *             .groupNames(groups.apply(getAmiIdsResult -&gt; getAmiIdsResult.getNames()))
     *             .notifications(            
     *                 &#34;autoscaling:EC2_INSTANCE_LAUNCH&#34;,
     *                 &#34;autoscaling:EC2_INSTANCE_TERMINATE&#34;,
     *                 &#34;autoscaling:EC2_INSTANCE_LAUNCH_ERROR&#34;,
     *                 &#34;autoscaling:EC2_INSTANCE_TERMINATE_ERROR&#34;)
     *             .topicArn(&#34;TOPIC ARN&#34;)
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAmiIdsResult> getAmiIds(GetAmiIdsArgs args) {
        return getAmiIds(args, InvokeOptions.Empty);
    }
    /**
     * The Autoscaling Groups data source allows access to the list of AWS
     * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
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
     *         final var groups = Output.of(AutoscalingFunctions.getAmiIds(GetAmiIdsArgs.builder()
     *             .filters(            
     *                 GetAmiIdsFilter.builder()
     *                     .name(&#34;tag:Team&#34;)
     *                     .values(&#34;Pets&#34;)
     *                     .build(),
     *                 GetAmiIdsFilter.builder()
     *                     .name(&#34;tag-key&#34;)
     *                     .values(&#34;Environment&#34;)
     *                     .build())
     *             .build()));
     * 
     *         var slackNotifications = new Notification(&#34;slackNotifications&#34;, NotificationArgs.builder()        
     *             .groupNames(groups.apply(getAmiIdsResult -&gt; getAmiIdsResult.getNames()))
     *             .notifications(            
     *                 &#34;autoscaling:EC2_INSTANCE_LAUNCH&#34;,
     *                 &#34;autoscaling:EC2_INSTANCE_TERMINATE&#34;,
     *                 &#34;autoscaling:EC2_INSTANCE_LAUNCH_ERROR&#34;,
     *                 &#34;autoscaling:EC2_INSTANCE_TERMINATE_ERROR&#34;)
     *             .topicArn(&#34;TOPIC ARN&#34;)
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAmiIdsResult> getAmiIds(GetAmiIdsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:autoscaling/getAmiIds:getAmiIds", TypeShape.of(GetAmiIdsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing autoscaling group.
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
     *         final var foo = Output.of(AutoscalingFunctions.getGroup(GetTargetGroupArgs.builder()
     *             .name(&#34;foo&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args) {
        return getGroup(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information on an existing autoscaling group.
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
     *         final var foo = Output.of(AutoscalingFunctions.getGroup(GetTargetGroupArgs.builder()
     *             .name(&#34;foo&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:autoscaling/getGroup:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
}
