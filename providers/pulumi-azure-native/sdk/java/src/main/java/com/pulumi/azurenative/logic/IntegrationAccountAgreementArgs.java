// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.logic.enums.AgreementType;
import com.pulumi.azurenative.logic.inputs.AgreementContentArgs;
import com.pulumi.azurenative.logic.inputs.BusinessIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountAgreementArgs extends ResourceArgs {

    public static final IntegrationAccountAgreementArgs Empty = new IntegrationAccountAgreementArgs();

    /**
     * The integration account agreement name.
     * 
     */
    @Import(name="agreementName")
    private @Nullable Output<String> agreementName;

    /**
     * @return The integration account agreement name.
     * 
     */
    public Optional<Output<String>> agreementName() {
        return Optional.ofNullable(this.agreementName);
    }

    /**
     * The agreement type.
     * 
     */
    @Import(name="agreementType", required=true)
    private Output<AgreementType> agreementType;

    /**
     * @return The agreement type.
     * 
     */
    public Output<AgreementType> agreementType() {
        return this.agreementType;
    }

    /**
     * The agreement content.
     * 
     */
    @Import(name="content", required=true)
    private Output<AgreementContentArgs> content;

    /**
     * @return The agreement content.
     * 
     */
    public Output<AgreementContentArgs> content() {
        return this.content;
    }

    /**
     * The business identity of the guest partner.
     * 
     */
    @Import(name="guestIdentity", required=true)
    private Output<BusinessIdentityArgs> guestIdentity;

    /**
     * @return The business identity of the guest partner.
     * 
     */
    public Output<BusinessIdentityArgs> guestIdentity() {
        return this.guestIdentity;
    }

    /**
     * The integration account partner that is set as guest partner for this agreement.
     * 
     */
    @Import(name="guestPartner", required=true)
    private Output<String> guestPartner;

    /**
     * @return The integration account partner that is set as guest partner for this agreement.
     * 
     */
    public Output<String> guestPartner() {
        return this.guestPartner;
    }

    /**
     * The business identity of the host partner.
     * 
     */
    @Import(name="hostIdentity", required=true)
    private Output<BusinessIdentityArgs> hostIdentity;

    /**
     * @return The business identity of the host partner.
     * 
     */
    public Output<BusinessIdentityArgs> hostIdentity() {
        return this.hostIdentity;
    }

    /**
     * The integration account partner that is set as host partner for this agreement.
     * 
     */
    @Import(name="hostPartner", required=true)
    private Output<String> hostPartner;

    /**
     * @return The integration account partner that is set as host partner for this agreement.
     * 
     */
    public Output<String> hostPartner() {
        return this.hostPartner;
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private Output<String> integrationAccountName;

    /**
     * @return The integration account name.
     * 
     */
    public Output<String> integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private IntegrationAccountAgreementArgs() {}

    private IntegrationAccountAgreementArgs(IntegrationAccountAgreementArgs $) {
        this.agreementName = $.agreementName;
        this.agreementType = $.agreementType;
        this.content = $.content;
        this.guestIdentity = $.guestIdentity;
        this.guestPartner = $.guestPartner;
        this.hostIdentity = $.hostIdentity;
        this.hostPartner = $.hostPartner;
        this.integrationAccountName = $.integrationAccountName;
        this.location = $.location;
        this.metadata = $.metadata;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountAgreementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountAgreementArgs $;

        public Builder() {
            $ = new IntegrationAccountAgreementArgs();
        }

        public Builder(IntegrationAccountAgreementArgs defaults) {
            $ = new IntegrationAccountAgreementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agreementName The integration account agreement name.
         * 
         * @return builder
         * 
         */
        public Builder agreementName(@Nullable Output<String> agreementName) {
            $.agreementName = agreementName;
            return this;
        }

        /**
         * @param agreementName The integration account agreement name.
         * 
         * @return builder
         * 
         */
        public Builder agreementName(String agreementName) {
            return agreementName(Output.of(agreementName));
        }

        /**
         * @param agreementType The agreement type.
         * 
         * @return builder
         * 
         */
        public Builder agreementType(Output<AgreementType> agreementType) {
            $.agreementType = agreementType;
            return this;
        }

        /**
         * @param agreementType The agreement type.
         * 
         * @return builder
         * 
         */
        public Builder agreementType(AgreementType agreementType) {
            return agreementType(Output.of(agreementType));
        }

        /**
         * @param content The agreement content.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<AgreementContentArgs> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The agreement content.
         * 
         * @return builder
         * 
         */
        public Builder content(AgreementContentArgs content) {
            return content(Output.of(content));
        }

        /**
         * @param guestIdentity The business identity of the guest partner.
         * 
         * @return builder
         * 
         */
        public Builder guestIdentity(Output<BusinessIdentityArgs> guestIdentity) {
            $.guestIdentity = guestIdentity;
            return this;
        }

        /**
         * @param guestIdentity The business identity of the guest partner.
         * 
         * @return builder
         * 
         */
        public Builder guestIdentity(BusinessIdentityArgs guestIdentity) {
            return guestIdentity(Output.of(guestIdentity));
        }

        /**
         * @param guestPartner The integration account partner that is set as guest partner for this agreement.
         * 
         * @return builder
         * 
         */
        public Builder guestPartner(Output<String> guestPartner) {
            $.guestPartner = guestPartner;
            return this;
        }

        /**
         * @param guestPartner The integration account partner that is set as guest partner for this agreement.
         * 
         * @return builder
         * 
         */
        public Builder guestPartner(String guestPartner) {
            return guestPartner(Output.of(guestPartner));
        }

        /**
         * @param hostIdentity The business identity of the host partner.
         * 
         * @return builder
         * 
         */
        public Builder hostIdentity(Output<BusinessIdentityArgs> hostIdentity) {
            $.hostIdentity = hostIdentity;
            return this;
        }

        /**
         * @param hostIdentity The business identity of the host partner.
         * 
         * @return builder
         * 
         */
        public Builder hostIdentity(BusinessIdentityArgs hostIdentity) {
            return hostIdentity(Output.of(hostIdentity));
        }

        /**
         * @param hostPartner The integration account partner that is set as host partner for this agreement.
         * 
         * @return builder
         * 
         */
        public Builder hostPartner(Output<String> hostPartner) {
            $.hostPartner = hostPartner;
            return this;
        }

        /**
         * @param hostPartner The integration account partner that is set as host partner for this agreement.
         * 
         * @return builder
         * 
         */
        public Builder hostPartner(String hostPartner) {
            return hostPartner(Output.of(hostPartner));
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(Output<String> integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            return integrationAccountName(Output.of(integrationAccountName));
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metadata The metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public IntegrationAccountAgreementArgs build() {
            $.agreementType = Objects.requireNonNull($.agreementType, "expected parameter 'agreementType' to be non-null");
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.guestIdentity = Objects.requireNonNull($.guestIdentity, "expected parameter 'guestIdentity' to be non-null");
            $.guestPartner = Objects.requireNonNull($.guestPartner, "expected parameter 'guestPartner' to be non-null");
            $.hostIdentity = Objects.requireNonNull($.hostIdentity, "expected parameter 'hostIdentity' to be non-null");
            $.hostPartner = Objects.requireNonNull($.hostPartner, "expected parameter 'hostPartner' to be non-null");
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
