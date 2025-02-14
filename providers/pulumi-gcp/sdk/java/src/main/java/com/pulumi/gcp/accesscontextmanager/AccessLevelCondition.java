// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionState;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelConditionDevicePolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Allows configuring a single access level condition to be appended to an access level&#39;s conditions.
 * This resource is intended to be used in cases where it is not possible to compile a full list
 * of conditions to include in a `gcp.accesscontextmanager.AccessLevel` resource,
 * to enable them to be added separately.
 * 
 * &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.AccessLevel` resource,
 * the access level resource must have a `lifecycle` block with `ignore_changes = [basic[0].conditions]` so
 * they don&#39;t fight over which service accounts should be included.
 * 
 * To get more information about AccessLevelCondition, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 * 
 * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the ACM API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition")
public class AccessLevelCondition extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Access Level to add this condition to.
     * 
     */
    @Export(name="accessLevel", type=String.class, parameters={})
    private Output<String> accessLevel;

    /**
     * @return The name of the Access Level to add this condition to.
     * 
     */
    public Output<String> accessLevel() {
        return this.accessLevel;
    }
    /**
     * Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    @Export(name="devicePolicy", type=AccessLevelConditionDevicePolicy.class, parameters={})
    private Output</* @Nullable */ AccessLevelConditionDevicePolicy> devicePolicy;

    /**
     * @return Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AccessLevelConditionDevicePolicy>> devicePolicy() {
        return Codegen.optional(this.devicePolicy);
    }
    /**
     * A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly,
     * for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34;
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    @Export(name="ipSubnetworks", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ipSubnetworks;

    /**
     * @return A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly,
     * for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34;
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    public Output<Optional<List<String>>> ipSubnetworks() {
        return Codegen.optional(this.ipSubnetworks);
    }
    /**
     * An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    @Export(name="members", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> members;

    /**
     * @return An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    public Output<Optional<List<String>>> members() {
        return Codegen.optional(this.members);
    }
    /**
     * Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    @Export(name="negate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> negate;

    /**
     * @return Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> negate() {
        return Codegen.optional(this.negate);
    }
    /**
     * The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    @Export(name="regions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> regions;

    /**
     * @return The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    public Output<Optional<List<String>>> regions() {
        return Codegen.optional(this.regions);
    }
    /**
     * A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    @Export(name="requiredAccessLevels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> requiredAccessLevels;

    /**
     * @return A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    public Output<Optional<List<String>>> requiredAccessLevels() {
        return Codegen.optional(this.requiredAccessLevels);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessLevelCondition(String name) {
        this(name, AccessLevelConditionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessLevelCondition(String name, AccessLevelConditionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessLevelCondition(String name, AccessLevelConditionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition", name, args == null ? AccessLevelConditionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessLevelCondition(String name, Output<String> id, @Nullable AccessLevelConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition", name, state, makeResourceOptions(options, id));
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
    public static AccessLevelCondition get(String name, Output<String> id, @Nullable AccessLevelConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessLevelCondition(name, id, state, options);
    }
}
