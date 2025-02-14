// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.streamanalytics.InputArgs;
import com.pulumi.azurenative.streamanalytics.outputs.ReferenceInputPropertiesResponse;
import com.pulumi.azurenative.streamanalytics.outputs.StreamInputPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
 * API Version: 2016-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:streamanalytics:Input input8899 /subscriptions/56b5e0a9-b645-407d-99b0-c64f86013e3d/resourceGroups/sjrg8161/providers/Microsoft.StreamAnalytics/streamingjobs/sj6695/inputs/input8899 
 * ```
 * 
 */
@ResourceType(type="azure-native:streamanalytics:Input")
public class Input extends com.pulumi.resources.CustomResource {
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Export(name="properties", type=Either.class, parameters={ReferenceInputPropertiesResponse.class, StreamInputPropertiesResponse.class})
    private Output<Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse>> properties;

    /**
     * @return The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Output<Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse>> properties() {
        return this.properties;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Input(String name) {
        this(name, InputArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Input(String name, InputArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Input(String name, InputArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:Input", name, args == null ? InputArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Input(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:Input", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20160301:Input").build()),
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20170401preview:Input").build()),
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20200301:Input").build()),
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20211001preview:Input").build())
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
    public static Input get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Input(name, id, options);
    }
}
