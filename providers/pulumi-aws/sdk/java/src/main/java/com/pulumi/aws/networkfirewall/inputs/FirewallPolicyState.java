// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyState Empty = new FirewallPolicyState();

    /**
     * The Amazon Resource Name (ARN) that identifies the firewall policy.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the firewall policy.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A friendly description of the firewall policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A friendly description of the firewall policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
     * 
     */
    @Import(name="firewallPolicy")
    private @Nullable Output<FirewallPolicyFirewallPolicyArgs> firewallPolicy;

    /**
     * @return A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
     * 
     */
    public Optional<Output<FirewallPolicyFirewallPolicyArgs>> firewallPolicy() {
        return Optional.ofNullable(this.firewallPolicy);
    }

    /**
     * A friendly name of the firewall policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name of the firewall policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * A string token used when updating a firewall policy.
     * 
     */
    @Import(name="updateToken")
    private @Nullable Output<String> updateToken;

    /**
     * @return A string token used when updating a firewall policy.
     * 
     */
    public Optional<Output<String>> updateToken() {
        return Optional.ofNullable(this.updateToken);
    }

    private FirewallPolicyState() {}

    private FirewallPolicyState(FirewallPolicyState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.firewallPolicy = $.firewallPolicy;
        this.name = $.name;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.updateToken = $.updateToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyState $;

        public Builder() {
            $ = new FirewallPolicyState();
        }

        public Builder(FirewallPolicyState defaults) {
            $ = new FirewallPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) that identifies the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) that identifies the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description A friendly description of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A friendly description of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param firewallPolicy A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicy(@Nullable Output<FirewallPolicyFirewallPolicyArgs> firewallPolicy) {
            $.firewallPolicy = firewallPolicy;
            return this;
        }

        /**
         * @param firewallPolicy A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicy(FirewallPolicyFirewallPolicyArgs firewallPolicy) {
            return firewallPolicy(Output.of(firewallPolicy));
        }

        /**
         * @param name A friendly name of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param updateToken A string token used when updating a firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder updateToken(@Nullable Output<String> updateToken) {
            $.updateToken = updateToken;
            return this;
        }

        /**
         * @param updateToken A string token used when updating a firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder updateToken(String updateToken) {
            return updateToken(Output.of(updateToken));
        }

        public FirewallPolicyState build() {
            return $;
        }
    }

}
