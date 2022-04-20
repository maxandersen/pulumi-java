// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.FirewallAllowGetArgs;
import com.pulumi.gcp.compute.inputs.FirewallDenyGetArgs;
import com.pulumi.gcp.compute.inputs.FirewallLogConfigGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallState Empty = new FirewallState();

    /**
     * The list of ALLOW rules specified by this firewall. Each rule
     * specifies a protocol and port-range tuple that describes a permitted
     * connection.
     * Structure is documented below.
     * 
     */
    @Import(name="allows")
      private final @Nullable Output<List<FirewallAllowGetArgs>> allows;

    public Output<List<FirewallAllowGetArgs>> allows() {
        return this.allows == null ? Codegen.empty() : this.allows;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> creationTimestamp() {
        return this.creationTimestamp == null ? Codegen.empty() : this.creationTimestamp;
    }

    /**
     * The list of DENY rules specified by this firewall. Each rule specifies
     * a protocol and port-range tuple that describes a denied connection.
     * Structure is documented below.
     * 
     */
    @Import(name="denies")
      private final @Nullable Output<List<FirewallDenyGetArgs>> denies;

    public Output<List<FirewallDenyGetArgs>> denies() {
        return this.denies == null ? Codegen.empty() : this.denies;
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * If destination ranges are specified, the firewall will apply only to
     * traffic that has destination IP address in these ranges. These ranges
     * must be expressed in CIDR format. Only IPv4 is supported.
     * 
     */
    @Import(name="destinationRanges")
      private final @Nullable Output<List<String>> destinationRanges;

    public Output<List<String>> destinationRanges() {
        return this.destinationRanges == null ? Codegen.empty() : this.destinationRanges;
    }

    /**
     * Direction of traffic to which this firewall applies; default is
     * INGRESS. Note: For INGRESS traffic, it is NOT supported to specify
     * destinationRanges; For EGRESS traffic, it is NOT supported to specify
     * `source_ranges` OR `source_tags`. For INGRESS traffic, one of `source_ranges`,
     * `source_tags` or `source_service_accounts` is required.
     * Possible values are `INGRESS` and `EGRESS`.
     * 
     */
    @Import(name="direction")
      private final @Nullable Output<String> direction;

    public Output<String> direction() {
        return this.direction == null ? Codegen.empty() : this.direction;
    }

    /**
     * Denotes whether the firewall rule is disabled, i.e not applied to the
     * network it is associated with. When set to true, the firewall rule is
     * not enforced and the network behaves as if it did not exist. If this
     * is unspecified, the firewall rule will be enabled.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * This field denotes whether to enable logging for a particular firewall rule.
     * If logging is enabled, logs will be exported to Stackdriver. Deprecated in favor of `log_config`
     * 
     * @deprecated
     * Deprecated in favor of log_config
     * 
     */
    @Deprecated /* Deprecated in favor of log_config */
    @Import(name="enableLogging")
      private final @Nullable Output<Boolean> enableLogging;

    @Deprecated /* Deprecated in favor of log_config */
    public Output<Boolean> enableLogging() {
        return this.enableLogging == null ? Codegen.empty() : this.enableLogging;
    }

    /**
     * This field denotes the logging options for a particular firewall rule.
     * If defined, logging is enabled, and logs will be exported to Cloud Logging.
     * Structure is documented below.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<FirewallLogConfigGetArgs> logConfig;

    public Output<FirewallLogConfigGetArgs> logConfig() {
        return this.logConfig == null ? Codegen.empty() : this.logConfig;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name or self_link of the network to attach this firewall to.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * Priority for this rule. This is an integer between 0 and 65535, both
     * inclusive. When not specified, the value assumed is 1000. Relative
     * priorities determine precedence of conflicting rules. Lower value of
     * priority implies higher precedence (eg, a rule with priority 0 has
     * higher precedence than a rule with priority 1). DENY rules take
     * precedence over ALLOW rules having equal priority.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> selfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * If source ranges are specified, the firewall will apply only to
     * traffic that has source IP address in these ranges. These ranges must
     * be expressed in CIDR format. One or both of sourceRanges and
     * sourceTags may be set. If both properties are set, the firewall will
     * apply to traffic that has source IP address within sourceRanges OR the
     * source IP that belongs to a tag listed in the sourceTags property. The
     * connection does not need to match both properties for the firewall to
     * apply. Only IPv4 is supported. For INGRESS traffic, one of `source_ranges`,
     * `source_tags` or `source_service_accounts` is required.
     * 
     */
    @Import(name="sourceRanges")
      private final @Nullable Output<List<String>> sourceRanges;

    public Output<List<String>> sourceRanges() {
        return this.sourceRanges == null ? Codegen.empty() : this.sourceRanges;
    }

    /**
     * If source service accounts are specified, the firewall will apply only
     * to traffic originating from an instance with a service account in this
     * list. Source service accounts cannot be used to control traffic to an
     * instance&#39;s external IP address because service accounts are associated
     * with an instance, not an IP address. sourceRanges can be set at the
     * same time as sourceServiceAccounts. If both are set, the firewall will
     * apply to traffic that has source IP address within sourceRanges OR the
     * source IP belongs to an instance with service account listed in
     * sourceServiceAccount. The connection does not need to match both
     * properties for the firewall to apply. sourceServiceAccounts cannot be
     * used at the same time as sourceTags or targetTags. For INGRESS traffic,
     * one of `source_ranges`, `source_tags` or `source_service_accounts` is required.
     * 
     */
    @Import(name="sourceServiceAccounts")
      private final @Nullable Output<List<String>> sourceServiceAccounts;

    public Output<List<String>> sourceServiceAccounts() {
        return this.sourceServiceAccounts == null ? Codegen.empty() : this.sourceServiceAccounts;
    }

    /**
     * If source tags are specified, the firewall will apply only to traffic
     * with source IP that belongs to a tag listed in source tags. Source
     * tags cannot be used to control traffic to an instance&#39;s external IP
     * address. Because tags are associated with an instance, not an IP
     * address. One or both of sourceRanges and sourceTags may be set. If
     * both properties are set, the firewall will apply to traffic that has
     * source IP address within sourceRanges OR the source IP that belongs to
     * a tag listed in the sourceTags property. The connection does not need
     * to match both properties for the firewall to apply. For INGRESS traffic,
     * one of `source_ranges`, `source_tags` or `source_service_accounts` is required.
     * 
     */
    @Import(name="sourceTags")
      private final @Nullable Output<List<String>> sourceTags;

    public Output<List<String>> sourceTags() {
        return this.sourceTags == null ? Codegen.empty() : this.sourceTags;
    }

    /**
     * A list of service accounts indicating sets of instances located in the
     * network that may make network connections as specified in allowed[].
     * targetServiceAccounts cannot be used at the same time as targetTags or
     * sourceTags. If neither targetServiceAccounts nor targetTags are
     * specified, the firewall rule applies to all instances on the specified
     * network.
     * 
     */
    @Import(name="targetServiceAccounts")
      private final @Nullable Output<List<String>> targetServiceAccounts;

    public Output<List<String>> targetServiceAccounts() {
        return this.targetServiceAccounts == null ? Codegen.empty() : this.targetServiceAccounts;
    }

    /**
     * A list of instance tags indicating sets of instances located in the
     * network that may make network connections as specified in allowed[].
     * If no targetTags are specified, the firewall rule applies to all
     * instances on the specified network.
     * 
     */
    @Import(name="targetTags")
      private final @Nullable Output<List<String>> targetTags;

    public Output<List<String>> targetTags() {
        return this.targetTags == null ? Codegen.empty() : this.targetTags;
    }

    public FirewallState(
        @Nullable Output<List<FirewallAllowGetArgs>> allows,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<List<FirewallDenyGetArgs>> denies,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> destinationRanges,
        @Nullable Output<String> direction,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<Boolean> enableLogging,
        @Nullable Output<FirewallLogConfigGetArgs> logConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> project,
        @Nullable Output<String> selfLink,
        @Nullable Output<List<String>> sourceRanges,
        @Nullable Output<List<String>> sourceServiceAccounts,
        @Nullable Output<List<String>> sourceTags,
        @Nullable Output<List<String>> targetServiceAccounts,
        @Nullable Output<List<String>> targetTags) {
        this.allows = allows;
        this.creationTimestamp = creationTimestamp;
        this.denies = denies;
        this.description = description;
        this.destinationRanges = destinationRanges;
        this.direction = direction;
        this.disabled = disabled;
        this.enableLogging = enableLogging;
        this.logConfig = logConfig;
        this.name = name;
        this.network = network;
        this.priority = priority;
        this.project = project;
        this.selfLink = selfLink;
        this.sourceRanges = sourceRanges;
        this.sourceServiceAccounts = sourceServiceAccounts;
        this.sourceTags = sourceTags;
        this.targetServiceAccounts = targetServiceAccounts;
        this.targetTags = targetTags;
    }

    private FirewallState() {
        this.allows = Codegen.empty();
        this.creationTimestamp = Codegen.empty();
        this.denies = Codegen.empty();
        this.description = Codegen.empty();
        this.destinationRanges = Codegen.empty();
        this.direction = Codegen.empty();
        this.disabled = Codegen.empty();
        this.enableLogging = Codegen.empty();
        this.logConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.priority = Codegen.empty();
        this.project = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.sourceRanges = Codegen.empty();
        this.sourceServiceAccounts = Codegen.empty();
        this.sourceTags = Codegen.empty();
        this.targetServiceAccounts = Codegen.empty();
        this.targetTags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirewallAllowGetArgs>> allows;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<List<FirewallDenyGetArgs>> denies;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> destinationRanges;
        private @Nullable Output<String> direction;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<Boolean> enableLogging;
        private @Nullable Output<FirewallLogConfigGetArgs> logConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> project;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<List<String>> sourceRanges;
        private @Nullable Output<List<String>> sourceServiceAccounts;
        private @Nullable Output<List<String>> sourceTags;
        private @Nullable Output<List<String>> targetServiceAccounts;
        private @Nullable Output<List<String>> targetTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allows = defaults.allows;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.denies = defaults.denies;
    	      this.description = defaults.description;
    	      this.destinationRanges = defaults.destinationRanges;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.enableLogging = defaults.enableLogging;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.sourceRanges = defaults.sourceRanges;
    	      this.sourceServiceAccounts = defaults.sourceServiceAccounts;
    	      this.sourceTags = defaults.sourceTags;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
    	      this.targetTags = defaults.targetTags;
        }

        public Builder allows(@Nullable Output<List<FirewallAllowGetArgs>> allows) {
            this.allows = allows;
            return this;
        }
        public Builder allows(@Nullable List<FirewallAllowGetArgs> allows) {
            this.allows = Codegen.ofNullable(allows);
            return this;
        }
        public Builder allows(FirewallAllowGetArgs... allows) {
            return allows(List.of(allows));
        }
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Codegen.ofNullable(creationTimestamp);
            return this;
        }
        public Builder denies(@Nullable Output<List<FirewallDenyGetArgs>> denies) {
            this.denies = denies;
            return this;
        }
        public Builder denies(@Nullable List<FirewallDenyGetArgs> denies) {
            this.denies = Codegen.ofNullable(denies);
            return this;
        }
        public Builder denies(FirewallDenyGetArgs... denies) {
            return denies(List.of(denies));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destinationRanges(@Nullable Output<List<String>> destinationRanges) {
            this.destinationRanges = destinationRanges;
            return this;
        }
        public Builder destinationRanges(@Nullable List<String> destinationRanges) {
            this.destinationRanges = Codegen.ofNullable(destinationRanges);
            return this;
        }
        public Builder destinationRanges(String... destinationRanges) {
            return destinationRanges(List.of(destinationRanges));
        }
        public Builder direction(@Nullable Output<String> direction) {
            this.direction = direction;
            return this;
        }
        public Builder direction(@Nullable String direction) {
            this.direction = Codegen.ofNullable(direction);
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }
        public Builder enableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Codegen.ofNullable(enableLogging);
            return this;
        }
        public Builder logConfig(@Nullable Output<FirewallLogConfigGetArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable FirewallLogConfigGetArgs logConfig) {
            this.logConfig = Codegen.ofNullable(logConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder sourceRanges(@Nullable Output<List<String>> sourceRanges) {
            this.sourceRanges = sourceRanges;
            return this;
        }
        public Builder sourceRanges(@Nullable List<String> sourceRanges) {
            this.sourceRanges = Codegen.ofNullable(sourceRanges);
            return this;
        }
        public Builder sourceRanges(String... sourceRanges) {
            return sourceRanges(List.of(sourceRanges));
        }
        public Builder sourceServiceAccounts(@Nullable Output<List<String>> sourceServiceAccounts) {
            this.sourceServiceAccounts = sourceServiceAccounts;
            return this;
        }
        public Builder sourceServiceAccounts(@Nullable List<String> sourceServiceAccounts) {
            this.sourceServiceAccounts = Codegen.ofNullable(sourceServiceAccounts);
            return this;
        }
        public Builder sourceServiceAccounts(String... sourceServiceAccounts) {
            return sourceServiceAccounts(List.of(sourceServiceAccounts));
        }
        public Builder sourceTags(@Nullable Output<List<String>> sourceTags) {
            this.sourceTags = sourceTags;
            return this;
        }
        public Builder sourceTags(@Nullable List<String> sourceTags) {
            this.sourceTags = Codegen.ofNullable(sourceTags);
            return this;
        }
        public Builder sourceTags(String... sourceTags) {
            return sourceTags(List.of(sourceTags));
        }
        public Builder targetServiceAccounts(@Nullable Output<List<String>> targetServiceAccounts) {
            this.targetServiceAccounts = targetServiceAccounts;
            return this;
        }
        public Builder targetServiceAccounts(@Nullable List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Codegen.ofNullable(targetServiceAccounts);
            return this;
        }
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }
        public Builder targetTags(@Nullable Output<List<String>> targetTags) {
            this.targetTags = targetTags;
            return this;
        }
        public Builder targetTags(@Nullable List<String> targetTags) {
            this.targetTags = Codegen.ofNullable(targetTags);
            return this;
        }
        public Builder targetTags(String... targetTags) {
            return targetTags(List.of(targetTags));
        }        public FirewallState build() {
            return new FirewallState(allows, creationTimestamp, denies, description, destinationRanges, direction, disabled, enableLogging, logConfig, name, network, priority, project, selfLink, sourceRanges, sourceServiceAccounts, sourceTags, targetServiceAccounts, targetTags);
        }
    }
}
