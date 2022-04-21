// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement;

import com.pulumi.azurenative.costmanagement.enums.ConnectorBillingModel;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudConnectorArgs Empty = new CloudConnectorArgs();

    /**
     * Connector billing model
     * 
     */
    @Import(name="billingModel")
    private @Nullable Output<Either<String,ConnectorBillingModel>> billingModel;

    public Optional<Output<Either<String,ConnectorBillingModel>>> billingModel() {
        return Optional.ofNullable(this.billingModel);
    }

    /**
     * Connector Name.
     * 
     */
    @Import(name="connectorName")
    private @Nullable Output<String> connectorName;

    public Optional<Output<String>> connectorName() {
        return Optional.ofNullable(this.connectorName);
    }

    /**
     * Credentials authentication key (eg AWS ARN)
     * 
     */
    @Import(name="credentialsKey")
    private @Nullable Output<String> credentialsKey;

    public Optional<Output<String>> credentialsKey() {
        return Optional.ofNullable(this.credentialsKey);
    }

    /**
     * Credentials secret (eg AWS ExternalId)
     * 
     */
    @Import(name="credentialsSecret")
    private @Nullable Output<String> credentialsSecret;

    public Optional<Output<String>> credentialsSecret() {
        return Optional.ofNullable(this.credentialsSecret);
    }

    /**
     * Default ManagementGroupId
     * 
     */
    @Import(name="defaultManagementGroupId")
    private @Nullable Output<String> defaultManagementGroupId;

    public Optional<Output<String>> defaultManagementGroupId() {
        return Optional.ofNullable(this.defaultManagementGroupId);
    }

    /**
     * Connector DisplayName
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Connector kind (eg aws)
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Identifying source report. (For AWS this is a CUR report name, defined with Daily and with Resources)
     * 
     */
    @Import(name="reportId")
    private @Nullable Output<String> reportId;

    public Optional<Output<String>> reportId() {
        return Optional.ofNullable(this.reportId);
    }

    /**
     * Billing SubscriptionId
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    private CloudConnectorArgs() {}

    private CloudConnectorArgs(CloudConnectorArgs $) {
        this.billingModel = $.billingModel;
        this.connectorName = $.connectorName;
        this.credentialsKey = $.credentialsKey;
        this.credentialsSecret = $.credentialsSecret;
        this.defaultManagementGroupId = $.defaultManagementGroupId;
        this.displayName = $.displayName;
        this.kind = $.kind;
        this.reportId = $.reportId;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudConnectorArgs $;

        public Builder() {
            $ = new CloudConnectorArgs();
        }

        public Builder(CloudConnectorArgs defaults) {
            $ = new CloudConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder billingModel(@Nullable Output<Either<String,ConnectorBillingModel>> billingModel) {
            $.billingModel = billingModel;
            return this;
        }

        public Builder billingModel(Either<String,ConnectorBillingModel> billingModel) {
            return billingModel(Output.of(billingModel));
        }

        public Builder connectorName(@Nullable Output<String> connectorName) {
            $.connectorName = connectorName;
            return this;
        }

        public Builder connectorName(String connectorName) {
            return connectorName(Output.of(connectorName));
        }

        public Builder credentialsKey(@Nullable Output<String> credentialsKey) {
            $.credentialsKey = credentialsKey;
            return this;
        }

        public Builder credentialsKey(String credentialsKey) {
            return credentialsKey(Output.of(credentialsKey));
        }

        public Builder credentialsSecret(@Nullable Output<String> credentialsSecret) {
            $.credentialsSecret = credentialsSecret;
            return this;
        }

        public Builder credentialsSecret(String credentialsSecret) {
            return credentialsSecret(Output.of(credentialsSecret));
        }

        public Builder defaultManagementGroupId(@Nullable Output<String> defaultManagementGroupId) {
            $.defaultManagementGroupId = defaultManagementGroupId;
            return this;
        }

        public Builder defaultManagementGroupId(String defaultManagementGroupId) {
            return defaultManagementGroupId(Output.of(defaultManagementGroupId));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder reportId(@Nullable Output<String> reportId) {
            $.reportId = reportId;
            return this;
        }

        public Builder reportId(String reportId) {
            return reportId(Output.of(reportId));
        }

        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public CloudConnectorArgs build() {
            return $;
        }
    }

}
