// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.FirewallAllowGetArgs;
import com.pulumi.gcp.compute.inputs.FirewallDenyGetArgs;
import com.pulumi.gcp.compute.inputs.FirewallLogConfigGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<List<FirewallAllowGetArgs>> allows;

    public Optional<Output<List<FirewallAllowGetArgs>>> allows() {
        return Optional.ofNullable(this.allows);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
    private @Nullable Output<String> creationTimestamp;

    public Optional<Output<String>> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }

    /**
     * The list of DENY rules specified by this firewall. Each rule specifies
     * a protocol and port-range tuple that describes a denied connection.
     * Structure is documented below.
     * 
     */
    @Import(name="denies")
    private @Nullable Output<List<FirewallDenyGetArgs>> denies;

    public Optional<Output<List<FirewallDenyGetArgs>>> denies() {
        return Optional.ofNullable(this.denies);
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If destination ranges are specified, the firewall will apply only to
     * traffic that has destination IP address in these ranges. These ranges
     * must be expressed in CIDR format. Only IPv4 is supported.
     * 
     */
    @Import(name="destinationRanges")
    private @Nullable Output<List<String>> destinationRanges;

    public Optional<Output<List<String>>> destinationRanges() {
        return Optional.ofNullable(this.destinationRanges);
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
    private @Nullable Output<String> direction;

    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Denotes whether the firewall rule is disabled, i.e not applied to the
     * network it is associated with. When set to true, the firewall rule is
     * not enforced and the network behaves as if it did not exist. If this
     * is unspecified, the firewall rule will be enabled.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
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
    private @Nullable Output<Boolean> enableLogging;

    @Deprecated /* Deprecated in favor of log_config */
    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    /**
     * This field denotes the logging options for a particular firewall rule.
     * If defined, logging is enabled, and logs will be exported to Cloud Logging.
     * Structure is documented below.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<FirewallLogConfigGetArgs> logConfig;

    public Optional<Output<FirewallLogConfigGetArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
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
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name or self_link of the network to attach this firewall to.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
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
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
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
    private @Nullable Output<List<String>> sourceRanges;

    public Optional<Output<List<String>>> sourceRanges() {
        return Optional.ofNullable(this.sourceRanges);
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
    private @Nullable Output<List<String>> sourceServiceAccounts;

    public Optional<Output<List<String>>> sourceServiceAccounts() {
        return Optional.ofNullable(this.sourceServiceAccounts);
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
    private @Nullable Output<List<String>> sourceTags;

    public Optional<Output<List<String>>> sourceTags() {
        return Optional.ofNullable(this.sourceTags);
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
    private @Nullable Output<List<String>> targetServiceAccounts;

    public Optional<Output<List<String>>> targetServiceAccounts() {
        return Optional.ofNullable(this.targetServiceAccounts);
    }

    /**
     * A list of instance tags indicating sets of instances located in the
     * network that may make network connections as specified in allowed[].
     * If no targetTags are specified, the firewall rule applies to all
     * instances on the specified network.
     * 
     */
    @Import(name="targetTags")
    private @Nullable Output<List<String>> targetTags;

    public Optional<Output<List<String>>> targetTags() {
        return Optional.ofNullable(this.targetTags);
    }

    private FirewallState() {}

    private FirewallState(FirewallState $) {
        this.allows = $.allows;
        this.creationTimestamp = $.creationTimestamp;
        this.denies = $.denies;
        this.description = $.description;
        this.destinationRanges = $.destinationRanges;
        this.direction = $.direction;
        this.disabled = $.disabled;
        this.enableLogging = $.enableLogging;
        this.logConfig = $.logConfig;
        this.name = $.name;
        this.network = $.network;
        this.priority = $.priority;
        this.project = $.project;
        this.selfLink = $.selfLink;
        this.sourceRanges = $.sourceRanges;
        this.sourceServiceAccounts = $.sourceServiceAccounts;
        this.sourceTags = $.sourceTags;
        this.targetServiceAccounts = $.targetServiceAccounts;
        this.targetTags = $.targetTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallState $;

        public Builder() {
            $ = new FirewallState();
        }

        public Builder(FirewallState defaults) {
            $ = new FirewallState(Objects.requireNonNull(defaults));
        }

        public Builder allows(@Nullable Output<List<FirewallAllowGetArgs>> allows) {
            $.allows = allows;
            return this;
        }

        public Builder allows(List<FirewallAllowGetArgs> allows) {
            return allows(Output.of(allows));
        }

        public Builder allows(FirewallAllowGetArgs... allows) {
            return allows(List.of(allows));
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            return creationTimestamp(Output.of(creationTimestamp));
        }

        public Builder denies(@Nullable Output<List<FirewallDenyGetArgs>> denies) {
            $.denies = denies;
            return this;
        }

        public Builder denies(List<FirewallDenyGetArgs> denies) {
            return denies(Output.of(denies));
        }

        public Builder denies(FirewallDenyGetArgs... denies) {
            return denies(List.of(denies));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder destinationRanges(@Nullable Output<List<String>> destinationRanges) {
            $.destinationRanges = destinationRanges;
            return this;
        }

        public Builder destinationRanges(List<String> destinationRanges) {
            return destinationRanges(Output.of(destinationRanges));
        }

        public Builder destinationRanges(String... destinationRanges) {
            return destinationRanges(List.of(destinationRanges));
        }

        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        public Builder logConfig(@Nullable Output<FirewallLogConfigGetArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(FirewallLogConfigGetArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        public Builder sourceRanges(@Nullable Output<List<String>> sourceRanges) {
            $.sourceRanges = sourceRanges;
            return this;
        }

        public Builder sourceRanges(List<String> sourceRanges) {
            return sourceRanges(Output.of(sourceRanges));
        }

        public Builder sourceRanges(String... sourceRanges) {
            return sourceRanges(List.of(sourceRanges));
        }

        public Builder sourceServiceAccounts(@Nullable Output<List<String>> sourceServiceAccounts) {
            $.sourceServiceAccounts = sourceServiceAccounts;
            return this;
        }

        public Builder sourceServiceAccounts(List<String> sourceServiceAccounts) {
            return sourceServiceAccounts(Output.of(sourceServiceAccounts));
        }

        public Builder sourceServiceAccounts(String... sourceServiceAccounts) {
            return sourceServiceAccounts(List.of(sourceServiceAccounts));
        }

        public Builder sourceTags(@Nullable Output<List<String>> sourceTags) {
            $.sourceTags = sourceTags;
            return this;
        }

        public Builder sourceTags(List<String> sourceTags) {
            return sourceTags(Output.of(sourceTags));
        }

        public Builder sourceTags(String... sourceTags) {
            return sourceTags(List.of(sourceTags));
        }

        public Builder targetServiceAccounts(@Nullable Output<List<String>> targetServiceAccounts) {
            $.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            return targetServiceAccounts(Output.of(targetServiceAccounts));
        }

        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }

        public Builder targetTags(@Nullable Output<List<String>> targetTags) {
            $.targetTags = targetTags;
            return this;
        }

        public Builder targetTags(List<String> targetTags) {
            return targetTags(Output.of(targetTags));
        }

        public Builder targetTags(String... targetTags) {
            return targetTags(List.of(targetTags));
        }

        public FirewallState build() {
            return $;
        }
    }

}
