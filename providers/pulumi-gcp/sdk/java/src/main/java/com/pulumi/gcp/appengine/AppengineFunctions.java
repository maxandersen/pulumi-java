// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountArgs;
import com.pulumi.gcp.appengine.outputs.GetDefaultServiceAccountResult;
import java.util.concurrent.CompletableFuture;

public final class AppengineFunctions {
    /**
     * Use this data source to retrieve the default App Engine service account for the specified project.
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
     *         final var default = Output.of(AppengineFunctions.getDefaultServiceAccount());
     * 
     *         ctx.export(&#34;defaultAccount&#34;, default_.getEmail());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDefaultServiceAccountResult> getDefaultServiceAccount() {
        return getDefaultServiceAccount(GetDefaultServiceAccountArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the default App Engine service account for the specified project.
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
     *         final var default = Output.of(AppengineFunctions.getDefaultServiceAccount());
     * 
     *         ctx.export(&#34;defaultAccount&#34;, default_.getEmail());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDefaultServiceAccountResult> getDefaultServiceAccount(GetDefaultServiceAccountArgs args) {
        return getDefaultServiceAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve the default App Engine service account for the specified project.
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
     *         final var default = Output.of(AppengineFunctions.getDefaultServiceAccount());
     * 
     *         ctx.export(&#34;defaultAccount&#34;, default_.getEmail());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDefaultServiceAccountResult> getDefaultServiceAccount(GetDefaultServiceAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:appengine/getDefaultServiceAccount:getDefaultServiceAccount", TypeShape.of(GetDefaultServiceAccountResult.class), args, Utilities.withVersion(options));
    }
}
