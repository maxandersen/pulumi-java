// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.accesscontextmanager_v1beta.ServicePerimeterArgs;
import com.pulumi.googlenative.accesscontextmanager_v1beta.outputs.ServicePerimeterConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a Service Perimeter. The longrunning operation from this RPC will have a successful status once the Service Perimeter has propagated to long-lasting storage. Service Perimeters containing errors will result in an error response for the first error encountered.
 * 
 */
@ResourceType(type="google-native:accesscontextmanager/v1beta:ServicePerimeter")
public class ServicePerimeter extends com.pulumi.resources.CustomResource {
    /**
     * Description of the `ServicePerimeter` and its use. Does not affect behavior.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the `ServicePerimeter` and its use. Does not affect behavior.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and &#39;_&#39;. Format: `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and &#39;_&#39;. Format: `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, restricted/unrestricted service lists as well as access lists must be empty.
     * 
     */
    @Export(name="perimeterType", type=String.class, parameters={})
    private Output<String> perimeterType;

    /**
     * @return Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, restricted/unrestricted service lists as well as access lists must be empty.
     * 
     */
    public Output<String> perimeterType() {
        return this.perimeterType;
    }
    /**
     * Current ServicePerimeter configuration. Specifies sets of resources, restricted/unrestricted services and access levels that determine perimeter content and boundaries.
     * 
     */
    @Export(name="status", type=ServicePerimeterConfigResponse.class, parameters={})
    private Output<ServicePerimeterConfigResponse> status;

    /**
     * @return Current ServicePerimeter configuration. Specifies sets of resources, restricted/unrestricted services and access levels that determine perimeter content and boundaries.
     * 
     */
    public Output<ServicePerimeterConfigResponse> status() {
        return this.status;
    }
    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return Human readable title. Must be unique within the Policy.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicePerimeter(String name) {
        this(name, ServicePerimeterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicePerimeter(String name, ServicePerimeterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePerimeter(String name, ServicePerimeterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:accesscontextmanager/v1beta:ServicePerimeter", name, args == null ? ServicePerimeterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServicePerimeter(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:accesscontextmanager/v1beta:ServicePerimeter", name, null, makeResourceOptions(options, id));
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
    public static ServicePerimeter get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServicePerimeter(name, id, options);
    }
}
