// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigArgs;
import com.pulumi.gcp.compute.inputs.SecurityPolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyArgs Empty = new SecurityPolicyArgs();

    /**
     * Configuration for [Google Cloud Armor Adaptive Protection](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * 
     */
    @Import(name="adaptiveProtectionConfig")
    private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;

    public Optional<Output<SecurityPolicyAdaptiveProtectionConfigArgs>> adaptiveProtectionConfig() {
        return Optional.ofNullable(this.adaptiveProtectionConfig);
    }

    /**
     * An optional description of this rule. Max size is 64.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the security policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The set of rules that belong to this policy. There must always be a default
     * rule (rule with priority 2147483647 and match &#34;\*&#34;). If no rules are provided when creating a
     * security policy, a default rule with action &#34;allow&#34; will be added. Structure is documented below.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<SecurityPolicyRuleArgs>> rules;

    public Optional<Output<List<SecurityPolicyRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private SecurityPolicyArgs() {}

    private SecurityPolicyArgs(SecurityPolicyArgs $) {
        this.adaptiveProtectionConfig = $.adaptiveProtectionConfig;
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyArgs $;

        public Builder() {
            $ = new SecurityPolicyArgs();
        }

        public Builder(SecurityPolicyArgs defaults) {
            $ = new SecurityPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder adaptiveProtectionConfig(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig) {
            $.adaptiveProtectionConfig = adaptiveProtectionConfig;
            return this;
        }

        public Builder adaptiveProtectionConfig(SecurityPolicyAdaptiveProtectionConfigArgs adaptiveProtectionConfig) {
            return adaptiveProtectionConfig(Output.of(adaptiveProtectionConfig));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder rules(@Nullable Output<List<SecurityPolicyRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<SecurityPolicyRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(SecurityPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public SecurityPolicyArgs build() {
            return $;
        }
    }

}
