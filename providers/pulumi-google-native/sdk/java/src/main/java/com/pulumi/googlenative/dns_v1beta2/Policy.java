// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dns_v1beta2.PolicyArgs;
import com.pulumi.googlenative.dns_v1beta2.outputs.PolicyAlternativeNameServerConfigResponse;
import com.pulumi.googlenative.dns_v1beta2.outputs.PolicyNetworkResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Policy.
 * 
 */
@ResourceType(type="google-native:dns/v1beta2:Policy")
public class Policy extends com.pulumi.resources.CustomResource {
    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    @Export(name="alternativeNameServerConfig", type=PolicyAlternativeNameServerConfigResponse.class, parameters={})
    private Output<PolicyAlternativeNameServerConfigResponse> alternativeNameServerConfig;

    /**
     * @return Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    public Output<PolicyAlternativeNameServerConfigResponse> alternativeNameServerConfig() {
        return this.alternativeNameServerConfig;
    }
    /**
     * A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the policy&#39;s function.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the policy&#39;s function.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    @Export(name="enableInboundForwarding", type=Boolean.class, parameters={})
    private Output<Boolean> enableInboundForwarding;

    /**
     * @return Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    public Output<Boolean> enableInboundForwarding() {
        return this.enableInboundForwarding;
    }
    /**
     * Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    @Export(name="enableLogging", type=Boolean.class, parameters={})
    private Output<Boolean> enableLogging;

    /**
     * @return Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    public Output<Boolean> enableLogging() {
        return this.enableLogging;
    }
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }
    /**
     * User-assigned name for this policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User-assigned name for this policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    @Export(name="networks", type=List.class, parameters={PolicyNetworkResponse.class})
    private Output<List<PolicyNetworkResponse>> networks;

    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    public Output<List<PolicyNetworkResponse>> networks() {
        return this.networks;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, @Nullable PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, @Nullable PolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:Policy", name, null, makeResourceOptions(options, id));
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
    public static Policy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, options);
    }
}
