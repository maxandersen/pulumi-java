// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalog;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.servicecatalog.ServiceActionArgs;
import com.pulumi.awsnative.servicecatalog.enums.ServiceActionAcceptLanguage;
import com.pulumi.awsnative.servicecatalog.enums.ServiceActionDefinitionType;
import com.pulumi.awsnative.servicecatalog.outputs.ServiceActionDefinitionParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Schema for AWS::ServiceCatalog::ServiceAction
 * 
 */
@ResourceType(type="aws-native:servicecatalog:ServiceAction")
public class ServiceAction extends com.pulumi.resources.CustomResource {
    @Export(name="acceptLanguage", type=ServiceActionAcceptLanguage.class, parameters={})
    private Output</* @Nullable */ ServiceActionAcceptLanguage> acceptLanguage;

    public Output</* @Nullable */ ServiceActionAcceptLanguage> acceptLanguage() {
        return this.acceptLanguage;
    }
    @Export(name="definition", type=List.class, parameters={ServiceActionDefinitionParameter.class})
    private Output<List<ServiceActionDefinitionParameter>> definition;

    public Output<List<ServiceActionDefinitionParameter>> definition() {
        return this.definition;
    }
    @Export(name="definitionType", type=ServiceActionDefinitionType.class, parameters={})
    private Output<ServiceActionDefinitionType> definitionType;

    public Output<ServiceActionDefinitionType> definitionType() {
        return this.definitionType;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceAction(String name) {
        this(name, ServiceActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAction(String name, ServiceActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAction(String name, ServiceActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:servicecatalog:ServiceAction", name, args == null ? ServiceActionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceAction(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:servicecatalog:ServiceAction", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ServiceAction get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAction(name, id, options);
    }
}
