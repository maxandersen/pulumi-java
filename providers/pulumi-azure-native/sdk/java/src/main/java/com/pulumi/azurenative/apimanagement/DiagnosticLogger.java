// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.DiagnosticLoggerArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Logger details.
 * API Version: 2018-01-01.
 * 
 * ## Example Usage
 * ### ApiManagementCreateDiagnosticLogger
 * 
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
 *         var diagnosticLogger = new DiagnosticLogger(&#34;diagnosticLogger&#34;, DiagnosticLoggerArgs.builder()        
 *             .diagnosticId(&#34;default&#34;)
 *             .loggerid(&#34;applicationinsights&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .serviceName(&#34;apimService1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:DiagnosticLogger applicationinsights /subscriptions/subid/resourcegroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/diagnostics/default/loggers/applicationinsights 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:DiagnosticLogger")
public class DiagnosticLogger extends com.pulumi.resources.CustomResource {
    /**
     * The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     * 
     */
    @Export(name="credentials", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> credentials;

    /**
     * @return The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     * 
     */
    public Output<Map<String,String>> credentials() {
        return this.credentials;
    }
    /**
     * Logger description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Logger description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether records are buffered in the logger before publishing. Default is assumed to be true.
     * 
     */
    @Export(name="isBuffered", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isBuffered;

    /**
     * @return Whether records are buffered in the logger before publishing. Default is assumed to be true.
     * 
     */
    public Output<Optional<Boolean>> isBuffered() {
        return Codegen.optional(this.isBuffered);
    }
    /**
     * Logger type.
     * 
     */
    @Export(name="loggerType", type=String.class, parameters={})
    private Output<String> loggerType;

    /**
     * @return Logger type.
     * 
     */
    public Output<String> loggerType() {
        return this.loggerType;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiagnosticLogger(String name) {
        this(name, DiagnosticLoggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiagnosticLogger(String name, DiagnosticLoggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiagnosticLogger(String name, DiagnosticLoggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:DiagnosticLogger", name, args == null ? DiagnosticLoggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiagnosticLogger(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:DiagnosticLogger", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:DiagnosticLogger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:DiagnosticLogger").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DiagnosticLogger get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiagnosticLogger(name, id, options);
    }
}
