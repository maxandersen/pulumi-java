// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.eventgrid.enums.PublicNetworkAccess;
import com.pulumi.azurenative.eventgrid.inputs.InboundIpRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PartnerNamespaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PartnerNamespaceArgs Empty = new PartnerNamespaceArgs();

    /**
     * This boolean is used to enable or disable local auth. Default value is false. When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to the partner namespace.
     * 
     */
    @Import(name="disableLocalAuth")
    private @Nullable Output<Boolean> disableLocalAuth;

    public Optional<Output<Boolean>> disableLocalAuth() {
        return Optional.ofNullable(this.disableLocalAuth);
    }

    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     */
    @Import(name="inboundIpRules")
    private @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules;

    public Optional<Output<List<InboundIpRuleArgs>>> inboundIpRules() {
        return Optional.ofNullable(this.inboundIpRules);
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the partner namespace.
     * 
     */
    @Import(name="partnerNamespaceName")
    private @Nullable Output<String> partnerNamespaceName;

    public Optional<Output<String>> partnerNamespaceName() {
        return Optional.ofNullable(this.partnerNamespaceName);
    }

    /**
     * The fully qualified ARM Id of the partner registration that should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
     */
    @Import(name="partnerRegistrationFullyQualifiedId")
    private @Nullable Output<String> partnerRegistrationFullyQualifiedId;

    public Optional<Output<String>> partnerRegistrationFullyQualifiedId() {
        return Optional.ofNullable(this.partnerRegistrationFullyQualifiedId);
    }

    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso cref=&#34;P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules&#34; /&gt;
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Optional<Output<Either<String,PublicNetworkAccess>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PartnerNamespaceArgs() {}

    private PartnerNamespaceArgs(PartnerNamespaceArgs $) {
        this.disableLocalAuth = $.disableLocalAuth;
        this.inboundIpRules = $.inboundIpRules;
        this.location = $.location;
        this.partnerNamespaceName = $.partnerNamespaceName;
        this.partnerRegistrationFullyQualifiedId = $.partnerRegistrationFullyQualifiedId;
        this.publicNetworkAccess = $.publicNetworkAccess;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartnerNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartnerNamespaceArgs $;

        public Builder() {
            $ = new PartnerNamespaceArgs();
        }

        public Builder(PartnerNamespaceArgs defaults) {
            $ = new PartnerNamespaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder disableLocalAuth(@Nullable Output<Boolean> disableLocalAuth) {
            $.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder disableLocalAuth(Boolean disableLocalAuth) {
            return disableLocalAuth(Output.of(disableLocalAuth));
        }

        public Builder inboundIpRules(@Nullable Output<List<InboundIpRuleArgs>> inboundIpRules) {
            $.inboundIpRules = inboundIpRules;
            return this;
        }

        public Builder inboundIpRules(List<InboundIpRuleArgs> inboundIpRules) {
            return inboundIpRules(Output.of(inboundIpRules));
        }

        public Builder inboundIpRules(InboundIpRuleArgs... inboundIpRules) {
            return inboundIpRules(List.of(inboundIpRules));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder partnerNamespaceName(@Nullable Output<String> partnerNamespaceName) {
            $.partnerNamespaceName = partnerNamespaceName;
            return this;
        }

        public Builder partnerNamespaceName(String partnerNamespaceName) {
            return partnerNamespaceName(Output.of(partnerNamespaceName));
        }

        public Builder partnerRegistrationFullyQualifiedId(@Nullable Output<String> partnerRegistrationFullyQualifiedId) {
            $.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
            return this;
        }

        public Builder partnerRegistrationFullyQualifiedId(String partnerRegistrationFullyQualifiedId) {
            return partnerRegistrationFullyQualifiedId(Output.of(partnerRegistrationFullyQualifiedId));
        }

        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder publicNetworkAccess(Either<String,PublicNetworkAccess> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PartnerNamespaceArgs build() {
            $.disableLocalAuth = Codegen.booleanProp("disableLocalAuth").output().arg($.disableLocalAuth).def(false).getNullable();
            $.publicNetworkAccess = Codegen.stringProp("publicNetworkAccess").left(PublicNetworkAccess.class).output().arg($.publicNetworkAccess).def("Enabled").getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
