// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directconnect.inputs.GetConnectionArgs;
import com.pulumi.aws.directconnect.inputs.GetGatewayArgs;
import com.pulumi.aws.directconnect.inputs.GetLocationArgs;
import com.pulumi.aws.directconnect.outputs.GetConnectionResult;
import com.pulumi.aws.directconnect.outputs.GetGatewayResult;
import com.pulumi.aws.directconnect.outputs.GetLocationResult;
import com.pulumi.aws.directconnect.outputs.GetLocationsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class DirectconnectFunctions {
    /**
     * Retrieve information about a Direct Connect Connection.
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
     *         final var example = Output.of(DirectconnectFunctions.getConnection(GetConnectionArgs.builder()
     *             .name(&#34;tf-dx-connection&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnection(GetConnectionArgs args) {
        return getConnection(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about a Direct Connect Connection.
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
     *         final var example = Output.of(DirectconnectFunctions.getConnection(GetConnectionArgs.builder()
     *             .name(&#34;tf-dx-connection&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnection(GetConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:directconnect/getConnection:getConnection", TypeShape.of(GetConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a Direct Connect Gateway.
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
     *         final var example = Output.of(DirectconnectFunctions.getGateway(GetGatewayArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGateway(GetGatewayArgs args) {
        return getGateway(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about a Direct Connect Gateway.
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
     *         final var example = Output.of(DirectconnectFunctions.getGateway(GetGatewayArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGateway(GetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:directconnect/getGateway:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a specific AWS Direct Connect location in the current AWS Region.
     * These are the locations that can be specified when configuring [`aws.directconnect.Connection`](https://www.terraform.io/docs/providers/aws/r/dx_connection.html) or [`aws.directconnect.LinkAggregationGroup`](https://www.terraform.io/docs/providers/aws/r/dx_lag.html) resources.
     * 
     * &gt; **Note:** This data source is different from the [`aws.directconnect.getLocations`](https://www.terraform.io/docs/providers/aws/d/dx_locations.html) data source which retrieves information about all the AWS Direct Connect locations in the current AWS Region.
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
     *         final var example = Output.of(DirectconnectFunctions.getLocation(GetLocationArgs.builder()
     *             .locationCode(&#34;CS32A-24FL&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLocationResult> getLocation(GetLocationArgs args) {
        return getLocation(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about a specific AWS Direct Connect location in the current AWS Region.
     * These are the locations that can be specified when configuring [`aws.directconnect.Connection`](https://www.terraform.io/docs/providers/aws/r/dx_connection.html) or [`aws.directconnect.LinkAggregationGroup`](https://www.terraform.io/docs/providers/aws/r/dx_lag.html) resources.
     * 
     * &gt; **Note:** This data source is different from the [`aws.directconnect.getLocations`](https://www.terraform.io/docs/providers/aws/d/dx_locations.html) data source which retrieves information about all the AWS Direct Connect locations in the current AWS Region.
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
     *         final var example = Output.of(DirectconnectFunctions.getLocation(GetLocationArgs.builder()
     *             .locationCode(&#34;CS32A-24FL&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLocationResult> getLocation(GetLocationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:directconnect/getLocation:getLocation", TypeShape.of(GetLocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about the AWS Direct Connect locations in the current AWS Region.
     * These are the locations that can be specified when configuring [`aws.directconnect.Connection`](https://www.terraform.io/docs/providers/aws/r/dx_connection.html) or [`aws.directconnect.LinkAggregationGroup`](https://www.terraform.io/docs/providers/aws/r/dx_lag.html) resources.
     * 
     * &gt; **Note:** This data source is different from the [`aws.directconnect.getLocation`](https://www.terraform.io/docs/providers/aws/d/dx_location.html) data source which retrieves information about a specific AWS Direct Connect location in the current AWS Region.
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
     *         final var available = Output.of(DirectconnectFunctions.getLocations());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLocationsResult> getLocations() {
        return getLocations(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the AWS Direct Connect locations in the current AWS Region.
     * These are the locations that can be specified when configuring [`aws.directconnect.Connection`](https://www.terraform.io/docs/providers/aws/r/dx_connection.html) or [`aws.directconnect.LinkAggregationGroup`](https://www.terraform.io/docs/providers/aws/r/dx_lag.html) resources.
     * 
     * &gt; **Note:** This data source is different from the [`aws.directconnect.getLocation`](https://www.terraform.io/docs/providers/aws/d/dx_location.html) data source which retrieves information about a specific AWS Direct Connect location in the current AWS Region.
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
     *         final var available = Output.of(DirectconnectFunctions.getLocations());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLocationsResult> getLocations(InvokeArgs args) {
        return getLocations(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the AWS Direct Connect locations in the current AWS Region.
     * These are the locations that can be specified when configuring [`aws.directconnect.Connection`](https://www.terraform.io/docs/providers/aws/r/dx_connection.html) or [`aws.directconnect.LinkAggregationGroup`](https://www.terraform.io/docs/providers/aws/r/dx_lag.html) resources.
     * 
     * &gt; **Note:** This data source is different from the [`aws.directconnect.getLocation`](https://www.terraform.io/docs/providers/aws/d/dx_location.html) data source which retrieves information about a specific AWS Direct Connect location in the current AWS Region.
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
     *         final var available = Output.of(DirectconnectFunctions.getLocations());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLocationsResult> getLocations(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:directconnect/getLocations:getLocations", TypeShape.of(GetLocationsResult.class), args, Utilities.withVersion(options));
    }
}
