// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1AssociationInfoArgs;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1CommitmentSettingsArgs;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1ParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntitlementArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntitlementArgs Empty = new EntitlementArgs();

    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Association information to other entitlements.
     * 
     */
    @Import(name="associationInfo")
      private final @Nullable Output<GoogleCloudChannelV1AssociationInfoArgs> associationInfo;

    public Output<GoogleCloudChannelV1AssociationInfoArgs> associationInfo() {
        return this.associationInfo == null ? Codegen.empty() : this.associationInfo;
    }

    /**
     * Commitment settings for a commitment-based Offer. Required for commitment based offers.
     * 
     */
    @Import(name="commitmentSettings")
      private final @Nullable Output<GoogleCloudChannelV1CommitmentSettingsArgs> commitmentSettings;

    public Output<GoogleCloudChannelV1CommitmentSettingsArgs> commitmentSettings() {
        return this.commitmentSettings == null ? Codegen.empty() : this.commitmentSettings;
    }

    @Import(name="customerId", required=true)
      private final Output<String> customerId;

    public Output<String> customerId() {
        return this.customerId;
    }

    /**
     * The offer resource name for which the entitlement is to be created. Takes the form: accounts/{account_id}/offers/{offer_id}.
     * 
     */
    @Import(name="offer", required=true)
      private final Output<String> offer;

    public Output<String> offer() {
        return this.offer;
    }

    /**
     * Extended entitlement parameters. When creating an entitlement, valid parameter names and values are defined in the Offer.parameter_definitions. The response may include the following output-only Parameters: - assigned_units: The number of licenses assigned to users. - max_units: The maximum assignable units for a flexible offer. - num_units: The total commitment for commitment-based offers.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<GoogleCloudChannelV1ParameterArgs>> parameters;

    public Output<List<GoogleCloudChannelV1ParameterArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Optional. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
     * 
     */
    @Import(name="purchaseOrderId")
      private final @Nullable Output<String> purchaseOrderId;

    public Output<String> purchaseOrderId() {
        return this.purchaseOrderId == null ? Codegen.empty() : this.purchaseOrderId;
    }

    /**
     * Optional. You can specify an optional unique request ID, and if you need to retry your request, the server will know to ignore the request if it's complete. For example, you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if it received the original operation with the same request ID. If it did, it will ignore the second request. The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122) with the exception that zero UUID is not supported (`00000000-0000-0000-0000-000000000000`).
     * 
     */
    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    public EntitlementArgs(
        Output<String> accountId,
        @Nullable Output<GoogleCloudChannelV1AssociationInfoArgs> associationInfo,
        @Nullable Output<GoogleCloudChannelV1CommitmentSettingsArgs> commitmentSettings,
        Output<String> customerId,
        Output<String> offer,
        @Nullable Output<List<GoogleCloudChannelV1ParameterArgs>> parameters,
        @Nullable Output<String> purchaseOrderId,
        @Nullable Output<String> requestId) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.associationInfo = associationInfo;
        this.commitmentSettings = commitmentSettings;
        this.customerId = Objects.requireNonNull(customerId, "expected parameter 'customerId' to be non-null");
        this.offer = Objects.requireNonNull(offer, "expected parameter 'offer' to be non-null");
        this.parameters = parameters;
        this.purchaseOrderId = purchaseOrderId;
        this.requestId = requestId;
    }

    private EntitlementArgs() {
        this.accountId = Codegen.empty();
        this.associationInfo = Codegen.empty();
        this.commitmentSettings = Codegen.empty();
        this.customerId = Codegen.empty();
        this.offer = Codegen.empty();
        this.parameters = Codegen.empty();
        this.purchaseOrderId = Codegen.empty();
        this.requestId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntitlementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private @Nullable Output<GoogleCloudChannelV1AssociationInfoArgs> associationInfo;
        private @Nullable Output<GoogleCloudChannelV1CommitmentSettingsArgs> commitmentSettings;
        private Output<String> customerId;
        private Output<String> offer;
        private @Nullable Output<List<GoogleCloudChannelV1ParameterArgs>> parameters;
        private @Nullable Output<String> purchaseOrderId;
        private @Nullable Output<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(EntitlementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.associationInfo = defaults.associationInfo;
    	      this.commitmentSettings = defaults.commitmentSettings;
    	      this.customerId = defaults.customerId;
    	      this.offer = defaults.offer;
    	      this.parameters = defaults.parameters;
    	      this.purchaseOrderId = defaults.purchaseOrderId;
    	      this.requestId = defaults.requestId;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }
        public Builder associationInfo(@Nullable Output<GoogleCloudChannelV1AssociationInfoArgs> associationInfo) {
            this.associationInfo = associationInfo;
            return this;
        }
        public Builder associationInfo(@Nullable GoogleCloudChannelV1AssociationInfoArgs associationInfo) {
            this.associationInfo = Codegen.ofNullable(associationInfo);
            return this;
        }
        public Builder commitmentSettings(@Nullable Output<GoogleCloudChannelV1CommitmentSettingsArgs> commitmentSettings) {
            this.commitmentSettings = commitmentSettings;
            return this;
        }
        public Builder commitmentSettings(@Nullable GoogleCloudChannelV1CommitmentSettingsArgs commitmentSettings) {
            this.commitmentSettings = Codegen.ofNullable(commitmentSettings);
            return this;
        }
        public Builder customerId(Output<String> customerId) {
            this.customerId = Objects.requireNonNull(customerId);
            return this;
        }
        public Builder customerId(String customerId) {
            this.customerId = Output.of(Objects.requireNonNull(customerId));
            return this;
        }
        public Builder offer(Output<String> offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }
        public Builder offer(String offer) {
            this.offer = Output.of(Objects.requireNonNull(offer));
            return this;
        }
        public Builder parameters(@Nullable Output<List<GoogleCloudChannelV1ParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<GoogleCloudChannelV1ParameterArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(GoogleCloudChannelV1ParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder purchaseOrderId(@Nullable Output<String> purchaseOrderId) {
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }
        public Builder purchaseOrderId(@Nullable String purchaseOrderId) {
            this.purchaseOrderId = Codegen.ofNullable(purchaseOrderId);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }        public EntitlementArgs build() {
            return new EntitlementArgs(accountId, associationInfo, commitmentSettings, customerId, offer, parameters, purchaseOrderId, requestId);
        }
    }
}
