// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pricing;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.pricing.inputs.GetProductArgs;
import com.pulumi.aws.pricing.outputs.GetProductResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class PricingFunctions {
    /**
     * Use this data source to get the pricing information of all products in AWS.
     * This data source is only available in a us-east-1 or ap-south-1 provider.
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
     *         final var example = Output.of(PricingFunctions.getProduct(GetProductArgs.builder()
     *             .filters(            
     *                 GetProductFilter.builder()
     *                     .field(&#34;instanceType&#34;)
     *                     .value(&#34;c5.xlarge&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;operatingSystem&#34;)
     *                     .value(&#34;Linux&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;location&#34;)
     *                     .value(&#34;US East (N. Virginia)&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;preInstalledSw&#34;)
     *                     .value(&#34;NA&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;licenseModel&#34;)
     *                     .value(&#34;No License required&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;tenancy&#34;)
     *                     .value(&#34;Shared&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;capacitystatus&#34;)
     *                     .value(&#34;Used&#34;)
     *                     .build())
     *             .serviceCode(&#34;AmazonEC2&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
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
     *         final var example = Output.of(PricingFunctions.getProduct(GetProductArgs.builder()
     *             .filters(            
     *                 GetProductFilter.builder()
     *                     .field(&#34;instanceType&#34;)
     *                     .value(&#34;ds1.xlarge&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;location&#34;)
     *                     .value(&#34;US East (N. Virginia)&#34;)
     *                     .build())
     *             .serviceCode(&#34;AmazonRedshift&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetProductResult> getProduct(GetProductArgs args) {
        return getProduct(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the pricing information of all products in AWS.
     * This data source is only available in a us-east-1 or ap-south-1 provider.
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
     *         final var example = Output.of(PricingFunctions.getProduct(GetProductArgs.builder()
     *             .filters(            
     *                 GetProductFilter.builder()
     *                     .field(&#34;instanceType&#34;)
     *                     .value(&#34;c5.xlarge&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;operatingSystem&#34;)
     *                     .value(&#34;Linux&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;location&#34;)
     *                     .value(&#34;US East (N. Virginia)&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;preInstalledSw&#34;)
     *                     .value(&#34;NA&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;licenseModel&#34;)
     *                     .value(&#34;No License required&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;tenancy&#34;)
     *                     .value(&#34;Shared&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;capacitystatus&#34;)
     *                     .value(&#34;Used&#34;)
     *                     .build())
     *             .serviceCode(&#34;AmazonEC2&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
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
     *         final var example = Output.of(PricingFunctions.getProduct(GetProductArgs.builder()
     *             .filters(            
     *                 GetProductFilter.builder()
     *                     .field(&#34;instanceType&#34;)
     *                     .value(&#34;ds1.xlarge&#34;)
     *                     .build(),
     *                 GetProductFilter.builder()
     *                     .field(&#34;location&#34;)
     *                     .value(&#34;US East (N. Virginia)&#34;)
     *                     .build())
     *             .serviceCode(&#34;AmazonRedshift&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetProductResult> getProduct(GetProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:pricing/getProduct:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
}
