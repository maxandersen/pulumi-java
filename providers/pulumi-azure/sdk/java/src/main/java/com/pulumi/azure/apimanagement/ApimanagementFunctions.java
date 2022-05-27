// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.inputs.GetApiArgs;
import com.pulumi.azure.apimanagement.inputs.GetApiVersionSetArgs;
import com.pulumi.azure.apimanagement.inputs.GetGatewayArgs;
import com.pulumi.azure.apimanagement.inputs.GetGroupArgs;
import com.pulumi.azure.apimanagement.inputs.GetProductArgs;
import com.pulumi.azure.apimanagement.inputs.GetServiceArgs;
import com.pulumi.azure.apimanagement.inputs.GetUserArgs;
import com.pulumi.azure.apimanagement.outputs.GetApiResult;
import com.pulumi.azure.apimanagement.outputs.GetApiVersionSetResult;
import com.pulumi.azure.apimanagement.outputs.GetGatewayResult;
import com.pulumi.azure.apimanagement.outputs.GetGroupResult;
import com.pulumi.azure.apimanagement.outputs.GetProductResult;
import com.pulumi.azure.apimanagement.outputs.GetServiceResult;
import com.pulumi.azure.apimanagement.outputs.GetUserResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ApimanagementFunctions {
    /**
     * Use this data source to access information about an existing API Management API.
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
     *         final var example = Output.of(ApimanagementFunctions.getApi(GetApiArgs.builder()
     *             .name(&#34;search-api&#34;)
     *             .apiManagementName(&#34;search-api-management&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .revision(&#34;2&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;apiManagementApiId&#34;, example.apply(getApiResult -&gt; getApiResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetApiResult> getApi(GetApiArgs args) {
        return getApi(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing API Management API.
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
     *         final var example = Output.of(ApimanagementFunctions.getApi(GetApiArgs.builder()
     *             .name(&#34;search-api&#34;)
     *             .apiManagementName(&#34;search-api-management&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .revision(&#34;2&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;apiManagementApiId&#34;, example.apply(getApiResult -&gt; getApiResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetApiResult> getApi(GetApiArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:apimanagement/getApi:getApi", TypeShape.of(GetApiResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Uses this data source to access information about an API Version Set within an API Management Service.
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
     *         final var example = Output.of(ApimanagementFunctions.getApiVersionSet(GetApiVersionSetArgs.builder()
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .apiManagementName(&#34;example-api&#34;)
     *             .name(&#34;example-api-version-set&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;apiManagementApiVersionSetId&#34;, example.apply(getApiVersionSetResult -&gt; getApiVersionSetResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetApiVersionSetResult> getApiVersionSet(GetApiVersionSetArgs args) {
        return getApiVersionSet(args, InvokeOptions.Empty);
    }
    /**
     * Uses this data source to access information about an API Version Set within an API Management Service.
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
     *         final var example = Output.of(ApimanagementFunctions.getApiVersionSet(GetApiVersionSetArgs.builder()
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .apiManagementName(&#34;example-api&#34;)
     *             .name(&#34;example-api-version-set&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;apiManagementApiVersionSetId&#34;, example.apply(getApiVersionSetResult -&gt; getApiVersionSetResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetApiVersionSetResult> getApiVersionSet(GetApiVersionSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:apimanagement/getApiVersionSet:getApiVersionSet", TypeShape.of(GetApiVersionSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing API Management Gateway.
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
     *         final var exampleService = Output.of(ApimanagementFunctions.getService(GetServiceArgs.builder()
     *             .name(&#34;example-apim&#34;)
     *             .resourceGroupName(&#34;example-rg&#34;)
     *             .build()));
     * 
     *         final var exampleGateway = Output.of(ApimanagementFunctions.getGateway(GetGatewayArgs.builder()
     *             .name(&#34;example-api-gateway&#34;)
     *             .apiManagementId(exampleService.apply(getServiceResult -&gt; getServiceResult.getId()))
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
     * Use this data source to access information about an existing API Management Gateway.
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
     *         final var exampleService = Output.of(ApimanagementFunctions.getService(GetServiceArgs.builder()
     *             .name(&#34;example-apim&#34;)
     *             .resourceGroupName(&#34;example-rg&#34;)
     *             .build()));
     * 
     *         final var exampleGateway = Output.of(ApimanagementFunctions.getGateway(GetGatewayArgs.builder()
     *             .name(&#34;example-api-gateway&#34;)
     *             .apiManagementId(exampleService.apply(getServiceResult -&gt; getServiceResult.getId()))
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGateway(GetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:apimanagement/getGateway:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing API Management Group.
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
     *         final var example = Output.of(ApimanagementFunctions.getGroup(GetGroupArgs.builder()
     *             .name(&#34;my-group&#34;)
     *             .apiManagementName(&#34;example-apim&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;groupType&#34;, example.apply(getGroupResult -&gt; getGroupResult.getType()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args) {
        return getGroup(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing API Management Group.
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
     *         final var example = Output.of(ApimanagementFunctions.getGroup(GetGroupArgs.builder()
     *             .name(&#34;my-group&#34;)
     *             .apiManagementName(&#34;example-apim&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;groupType&#34;, example.apply(getGroupResult -&gt; getGroupResult.getType()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:apimanagement/getGroup:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing API Management Product.
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
     *         final var example = Output.of(ApimanagementFunctions.getProduct(GetProductArgs.builder()
     *             .productId(&#34;my-product&#34;)
     *             .apiManagementName(&#34;example-apim&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;productTerms&#34;, example.apply(getProductResult -&gt; getProductResult.getTerms()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetProductResult> getProduct(GetProductArgs args) {
        return getProduct(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing API Management Product.
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
     *         final var example = Output.of(ApimanagementFunctions.getProduct(GetProductArgs.builder()
     *             .productId(&#34;my-product&#34;)
     *             .apiManagementName(&#34;example-apim&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;productTerms&#34;, example.apply(getProductResult -&gt; getProductResult.getTerms()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetProductResult> getProduct(GetProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:apimanagement/getProduct:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing API Management Service.
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
     *         final var example = Output.of(ApimanagementFunctions.getService(GetServiceArgs.builder()
     *             .name(&#34;search-api&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;apiManagementId&#34;, example.apply(getServiceResult -&gt; getServiceResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing API Management Service.
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
     *         final var example = Output.of(ApimanagementFunctions.getService(GetServiceArgs.builder()
     *             .name(&#34;search-api&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;apiManagementId&#34;, example.apply(getServiceResult -&gt; getServiceResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:apimanagement/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing API Management User.
     * 
     */
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args) {
        return getUser(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing API Management User.
     * 
     */
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:apimanagement/getUser:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
}
