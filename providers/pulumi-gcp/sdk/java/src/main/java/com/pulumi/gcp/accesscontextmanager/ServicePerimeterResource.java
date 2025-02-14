// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.accesscontextmanager.ServicePerimeterResourceArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterResourceState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows configuring a single GCP resource that should be inside of a service perimeter.
 * This resource is intended to be used in cases where it is not possible to compile a full list
 * of projects to include in a `gcp.accesscontextmanager.ServicePerimeter` resource,
 * to enable them to be added separately.
 * 
 * &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
 * the service perimeter resource must have a `lifecycle` block with `ignore_changes = [status[0].resources]` so
 * they don&#39;t fight over which resources should be in the policy.
 * 
 * To get more information about ServicePerimeterResource, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
 * * How-to Guides
 *     * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
 * 
 * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the ACM API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * ### Access Context Manager Service Perimeter Resource Basic
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
 *         var access_policy = new AccessPolicy(&#34;access-policy&#34;, AccessPolicyArgs.builder()        
 *             .parent(&#34;organizations/123456789&#34;)
 *             .title(&#34;my policy&#34;)
 *             .build());
 * 
 *         var service_perimeter_resourceServicePerimeter = new ServicePerimeter(&#34;service-perimeter-resourceServicePerimeter&#34;, ServicePerimeterArgs.builder()        
 *             .parent(access_policy.getName().apply(name -&gt; String.format(&#34;accessPolicies/%s&#34;, name)))
 *             .title(&#34;restrict_all&#34;)
 *             .status(ServicePerimeterStatus.builder()
 *                 .restrictedServices(&#34;storage.googleapis.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         var service_perimeter_resourceServicePerimeterResource = new ServicePerimeterResource(&#34;service-perimeter-resourceServicePerimeterResource&#34;, ServicePerimeterResourceArgs.builder()        
 *             .perimeterName(service_perimeter_resourceServicePerimeter.getName())
 *             .resource(&#34;projects/987654321&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * ServicePerimeterResource can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/servicePerimeterResource:ServicePerimeterResource default {{perimeter_name}}/{{resource}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/servicePerimeterResource:ServicePerimeterResource")
public class ServicePerimeterResource extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Service Perimeter to add this resource to.
     * 
     */
    @Export(name="perimeterName", type=String.class, parameters={})
    private Output<String> perimeterName;

    /**
     * @return The name of the Service Perimeter to add this resource to.
     * 
     */
    public Output<String> perimeterName() {
        return this.perimeterName;
    }
    /**
     * A GCP resource that is inside of the service perimeter.
     * Currently only projects are allowed.
     * Format: projects/{project_number}
     * 
     */
    @Export(name="resource", type=String.class, parameters={})
    private Output<String> resource;

    /**
     * @return A GCP resource that is inside of the service perimeter.
     * Currently only projects are allowed.
     * Format: projects/{project_number}
     * 
     */
    public Output<String> resource() {
        return this.resource;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicePerimeterResource(String name) {
        this(name, ServicePerimeterResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicePerimeterResource(String name, ServicePerimeterResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePerimeterResource(String name, ServicePerimeterResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/servicePerimeterResource:ServicePerimeterResource", name, args == null ? ServicePerimeterResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServicePerimeterResource(String name, Output<String> id, @Nullable ServicePerimeterResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/servicePerimeterResource:ServicePerimeterResource", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServicePerimeterResource get(String name, Output<String> id, @Nullable ServicePerimeterResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServicePerimeterResource(name, id, state, options);
    }
}
