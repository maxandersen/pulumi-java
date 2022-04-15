// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.eventgrid.enums.PartnerRegistrationVisibilityState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PartnerRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PartnerRegistrationArgs Empty = new PartnerRegistrationArgs();

    /**
     * List of Azure subscription Ids that are authorized to create a partner namespace
     * associated with this partner registration. This is an optional property. Creating
     * partner namespaces is always permitted under the same Azure subscription as the one used
     * for creating the partner registration.
     * 
     */
    @Import(name="authorizedAzureSubscriptionIds")
      private final @Nullable Output<List<String>> authorizedAzureSubscriptionIds;

    public Output<List<String>> authorizedAzureSubscriptionIds() {
        return this.authorizedAzureSubscriptionIds == null ? Codegen.empty() : this.authorizedAzureSubscriptionIds;
    }

    /**
     * The extension of the customer service URI of the publisher.
     * 
     */
    @Import(name="customerServiceUri")
      private final @Nullable Output<String> customerServiceUri;

    public Output<String> customerServiceUri() {
        return this.customerServiceUri == null ? Codegen.empty() : this.customerServiceUri;
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * URI of the logo.
     * 
     */
    @Import(name="logoUri")
      private final @Nullable Output<String> logoUri;

    public Output<String> logoUri() {
        return this.logoUri == null ? Codegen.empty() : this.logoUri;
    }

    /**
     * Long description for the custom scenarios and integration to be displayed in the portal if needed.
     * Length of this description should not exceed 2048 characters.
     * 
     */
    @Import(name="longDescription")
      private final @Nullable Output<String> longDescription;

    public Output<String> longDescription() {
        return this.longDescription == null ? Codegen.empty() : this.longDescription;
    }

    /**
     * The extension of the customer service number of the publisher. Only digits are allowed and number of digits should not exceed 10.
     * 
     */
    @Import(name="partnerCustomerServiceExtension")
      private final @Nullable Output<String> partnerCustomerServiceExtension;

    public Output<String> partnerCustomerServiceExtension() {
        return this.partnerCustomerServiceExtension == null ? Codegen.empty() : this.partnerCustomerServiceExtension;
    }

    /**
     * The customer service number of the publisher. The expected phone format should start with a '+' sign
     * followed by the country code. The remaining digits are then followed. Only digits and spaces are allowed and its
     * length cannot exceed 16 digits including country code. Examples of valid phone numbers are: +1 515 123 4567 and
     * +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515) 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43
     * 
     */
    @Import(name="partnerCustomerServiceNumber")
      private final @Nullable Output<String> partnerCustomerServiceNumber;

    public Output<String> partnerCustomerServiceNumber() {
        return this.partnerCustomerServiceNumber == null ? Codegen.empty() : this.partnerCustomerServiceNumber;
    }

    /**
     * Official name of the partner name. For example: "Contoso".
     * 
     */
    @Import(name="partnerName")
      private final @Nullable Output<String> partnerName;

    public Output<String> partnerName() {
        return this.partnerName == null ? Codegen.empty() : this.partnerName;
    }

    /**
     * Name of the partner registration.
     * 
     */
    @Import(name="partnerRegistrationName")
      private final @Nullable Output<String> partnerRegistrationName;

    public Output<String> partnerRegistrationName() {
        return this.partnerRegistrationName == null ? Codegen.empty() : this.partnerRegistrationName;
    }

    /**
     * Short description of the partner resource type. The length of this description should not exceed 256 characters.
     * 
     */
    @Import(name="partnerResourceTypeDescription")
      private final @Nullable Output<String> partnerResourceTypeDescription;

    public Output<String> partnerResourceTypeDescription() {
        return this.partnerResourceTypeDescription == null ? Codegen.empty() : this.partnerResourceTypeDescription;
    }

    /**
     * Display name of the partner resource type.
     * 
     */
    @Import(name="partnerResourceTypeDisplayName")
      private final @Nullable Output<String> partnerResourceTypeDisplayName;

    public Output<String> partnerResourceTypeDisplayName() {
        return this.partnerResourceTypeDisplayName == null ? Codegen.empty() : this.partnerResourceTypeDisplayName;
    }

    /**
     * Name of the partner resource type.
     * 
     */
    @Import(name="partnerResourceTypeName")
      private final @Nullable Output<String> partnerResourceTypeName;

    public Output<String> partnerResourceTypeName() {
        return this.partnerResourceTypeName == null ? Codegen.empty() : this.partnerResourceTypeName;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     * 
     */
    @Import(name="setupUri")
      private final @Nullable Output<String> setupUri;

    public Output<String> setupUri() {
        return this.setupUri == null ? Codegen.empty() : this.setupUri;
    }

    /**
     * Tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Visibility state of the partner registration.
     * 
     */
    @Import(name="visibilityState")
      private final @Nullable Output<Either<String,PartnerRegistrationVisibilityState>> visibilityState;

    public Output<Either<String,PartnerRegistrationVisibilityState>> visibilityState() {
        return this.visibilityState == null ? Codegen.empty() : this.visibilityState;
    }

    public PartnerRegistrationArgs(
        @Nullable Output<List<String>> authorizedAzureSubscriptionIds,
        @Nullable Output<String> customerServiceUri,
        @Nullable Output<String> location,
        @Nullable Output<String> logoUri,
        @Nullable Output<String> longDescription,
        @Nullable Output<String> partnerCustomerServiceExtension,
        @Nullable Output<String> partnerCustomerServiceNumber,
        @Nullable Output<String> partnerName,
        @Nullable Output<String> partnerRegistrationName,
        @Nullable Output<String> partnerResourceTypeDescription,
        @Nullable Output<String> partnerResourceTypeDisplayName,
        @Nullable Output<String> partnerResourceTypeName,
        Output<String> resourceGroupName,
        @Nullable Output<String> setupUri,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Either<String,PartnerRegistrationVisibilityState>> visibilityState) {
        this.authorizedAzureSubscriptionIds = authorizedAzureSubscriptionIds;
        this.customerServiceUri = customerServiceUri;
        this.location = location;
        this.logoUri = logoUri;
        this.longDescription = longDescription;
        this.partnerCustomerServiceExtension = partnerCustomerServiceExtension;
        this.partnerCustomerServiceNumber = partnerCustomerServiceNumber;
        this.partnerName = partnerName;
        this.partnerRegistrationName = partnerRegistrationName;
        this.partnerResourceTypeDescription = partnerResourceTypeDescription;
        this.partnerResourceTypeDisplayName = partnerResourceTypeDisplayName;
        this.partnerResourceTypeName = partnerResourceTypeName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.setupUri = setupUri;
        this.tags = tags;
        this.visibilityState = visibilityState;
    }

    private PartnerRegistrationArgs() {
        this.authorizedAzureSubscriptionIds = Codegen.empty();
        this.customerServiceUri = Codegen.empty();
        this.location = Codegen.empty();
        this.logoUri = Codegen.empty();
        this.longDescription = Codegen.empty();
        this.partnerCustomerServiceExtension = Codegen.empty();
        this.partnerCustomerServiceNumber = Codegen.empty();
        this.partnerName = Codegen.empty();
        this.partnerRegistrationName = Codegen.empty();
        this.partnerResourceTypeDescription = Codegen.empty();
        this.partnerResourceTypeDisplayName = Codegen.empty();
        this.partnerResourceTypeName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.setupUri = Codegen.empty();
        this.tags = Codegen.empty();
        this.visibilityState = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> authorizedAzureSubscriptionIds;
        private @Nullable Output<String> customerServiceUri;
        private @Nullable Output<String> location;
        private @Nullable Output<String> logoUri;
        private @Nullable Output<String> longDescription;
        private @Nullable Output<String> partnerCustomerServiceExtension;
        private @Nullable Output<String> partnerCustomerServiceNumber;
        private @Nullable Output<String> partnerName;
        private @Nullable Output<String> partnerRegistrationName;
        private @Nullable Output<String> partnerResourceTypeDescription;
        private @Nullable Output<String> partnerResourceTypeDisplayName;
        private @Nullable Output<String> partnerResourceTypeName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> setupUri;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Either<String,PartnerRegistrationVisibilityState>> visibilityState;

        public Builder() {
    	      // Empty
        }

        public Builder(PartnerRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedAzureSubscriptionIds = defaults.authorizedAzureSubscriptionIds;
    	      this.customerServiceUri = defaults.customerServiceUri;
    	      this.location = defaults.location;
    	      this.logoUri = defaults.logoUri;
    	      this.longDescription = defaults.longDescription;
    	      this.partnerCustomerServiceExtension = defaults.partnerCustomerServiceExtension;
    	      this.partnerCustomerServiceNumber = defaults.partnerCustomerServiceNumber;
    	      this.partnerName = defaults.partnerName;
    	      this.partnerRegistrationName = defaults.partnerRegistrationName;
    	      this.partnerResourceTypeDescription = defaults.partnerResourceTypeDescription;
    	      this.partnerResourceTypeDisplayName = defaults.partnerResourceTypeDisplayName;
    	      this.partnerResourceTypeName = defaults.partnerResourceTypeName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.setupUri = defaults.setupUri;
    	      this.tags = defaults.tags;
    	      this.visibilityState = defaults.visibilityState;
        }

        public Builder authorizedAzureSubscriptionIds(@Nullable Output<List<String>> authorizedAzureSubscriptionIds) {
            this.authorizedAzureSubscriptionIds = authorizedAzureSubscriptionIds;
            return this;
        }
        public Builder authorizedAzureSubscriptionIds(@Nullable List<String> authorizedAzureSubscriptionIds) {
            this.authorizedAzureSubscriptionIds = Codegen.ofNullable(authorizedAzureSubscriptionIds);
            return this;
        }
        public Builder authorizedAzureSubscriptionIds(String... authorizedAzureSubscriptionIds) {
            return authorizedAzureSubscriptionIds(List.of(authorizedAzureSubscriptionIds));
        }
        public Builder customerServiceUri(@Nullable Output<String> customerServiceUri) {
            this.customerServiceUri = customerServiceUri;
            return this;
        }
        public Builder customerServiceUri(@Nullable String customerServiceUri) {
            this.customerServiceUri = Codegen.ofNullable(customerServiceUri);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder logoUri(@Nullable Output<String> logoUri) {
            this.logoUri = logoUri;
            return this;
        }
        public Builder logoUri(@Nullable String logoUri) {
            this.logoUri = Codegen.ofNullable(logoUri);
            return this;
        }
        public Builder longDescription(@Nullable Output<String> longDescription) {
            this.longDescription = longDescription;
            return this;
        }
        public Builder longDescription(@Nullable String longDescription) {
            this.longDescription = Codegen.ofNullable(longDescription);
            return this;
        }
        public Builder partnerCustomerServiceExtension(@Nullable Output<String> partnerCustomerServiceExtension) {
            this.partnerCustomerServiceExtension = partnerCustomerServiceExtension;
            return this;
        }
        public Builder partnerCustomerServiceExtension(@Nullable String partnerCustomerServiceExtension) {
            this.partnerCustomerServiceExtension = Codegen.ofNullable(partnerCustomerServiceExtension);
            return this;
        }
        public Builder partnerCustomerServiceNumber(@Nullable Output<String> partnerCustomerServiceNumber) {
            this.partnerCustomerServiceNumber = partnerCustomerServiceNumber;
            return this;
        }
        public Builder partnerCustomerServiceNumber(@Nullable String partnerCustomerServiceNumber) {
            this.partnerCustomerServiceNumber = Codegen.ofNullable(partnerCustomerServiceNumber);
            return this;
        }
        public Builder partnerName(@Nullable Output<String> partnerName) {
            this.partnerName = partnerName;
            return this;
        }
        public Builder partnerName(@Nullable String partnerName) {
            this.partnerName = Codegen.ofNullable(partnerName);
            return this;
        }
        public Builder partnerRegistrationName(@Nullable Output<String> partnerRegistrationName) {
            this.partnerRegistrationName = partnerRegistrationName;
            return this;
        }
        public Builder partnerRegistrationName(@Nullable String partnerRegistrationName) {
            this.partnerRegistrationName = Codegen.ofNullable(partnerRegistrationName);
            return this;
        }
        public Builder partnerResourceTypeDescription(@Nullable Output<String> partnerResourceTypeDescription) {
            this.partnerResourceTypeDescription = partnerResourceTypeDescription;
            return this;
        }
        public Builder partnerResourceTypeDescription(@Nullable String partnerResourceTypeDescription) {
            this.partnerResourceTypeDescription = Codegen.ofNullable(partnerResourceTypeDescription);
            return this;
        }
        public Builder partnerResourceTypeDisplayName(@Nullable Output<String> partnerResourceTypeDisplayName) {
            this.partnerResourceTypeDisplayName = partnerResourceTypeDisplayName;
            return this;
        }
        public Builder partnerResourceTypeDisplayName(@Nullable String partnerResourceTypeDisplayName) {
            this.partnerResourceTypeDisplayName = Codegen.ofNullable(partnerResourceTypeDisplayName);
            return this;
        }
        public Builder partnerResourceTypeName(@Nullable Output<String> partnerResourceTypeName) {
            this.partnerResourceTypeName = partnerResourceTypeName;
            return this;
        }
        public Builder partnerResourceTypeName(@Nullable String partnerResourceTypeName) {
            this.partnerResourceTypeName = Codegen.ofNullable(partnerResourceTypeName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder setupUri(@Nullable Output<String> setupUri) {
            this.setupUri = setupUri;
            return this;
        }
        public Builder setupUri(@Nullable String setupUri) {
            this.setupUri = Codegen.ofNullable(setupUri);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder visibilityState(@Nullable Output<Either<String,PartnerRegistrationVisibilityState>> visibilityState) {
            this.visibilityState = visibilityState;
            return this;
        }
        public Builder visibilityState(@Nullable Either<String,PartnerRegistrationVisibilityState> visibilityState) {
            this.visibilityState = Codegen.ofNullable(visibilityState);
            return this;
        }        public PartnerRegistrationArgs build() {
            return new PartnerRegistrationArgs(authorizedAzureSubscriptionIds, customerServiceUri, location, logoUri, longDescription, partnerCustomerServiceExtension, partnerCustomerServiceNumber, partnerName, partnerRegistrationName, partnerResourceTypeDescription, partnerResourceTypeDisplayName, partnerResourceTypeName, resourceGroupName, setupUri, tags, visibilityState);
        }
    }
}
