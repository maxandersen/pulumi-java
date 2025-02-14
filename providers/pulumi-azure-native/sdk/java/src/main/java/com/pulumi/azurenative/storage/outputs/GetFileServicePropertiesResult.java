// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.CorsRulesResponse;
import com.pulumi.azurenative.storage.outputs.DeleteRetentionPolicyResponse;
import com.pulumi.azurenative.storage.outputs.ProtocolSettingsResponse;
import com.pulumi.azurenative.storage.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFileServicePropertiesResult {
    /**
     * @return Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    private final @Nullable CorsRulesResponse cors;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Protocol settings for file service
     * 
     */
    private final @Nullable ProtocolSettingsResponse protocolSettings;
    /**
     * @return The file service properties for share soft delete.
     * 
     */
    private final @Nullable DeleteRetentionPolicyResponse shareDeleteRetentionPolicy;
    /**
     * @return Sku name and tier.
     * 
     */
    private final SkuResponse sku;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetFileServicePropertiesResult(
        @CustomType.Parameter("cors") @Nullable CorsRulesResponse cors,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protocolSettings") @Nullable ProtocolSettingsResponse protocolSettings,
        @CustomType.Parameter("shareDeleteRetentionPolicy") @Nullable DeleteRetentionPolicyResponse shareDeleteRetentionPolicy,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("type") String type) {
        this.cors = cors;
        this.id = id;
        this.name = name;
        this.protocolSettings = protocolSettings;
        this.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
        this.sku = sku;
        this.type = type;
    }

    /**
     * @return Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    public Optional<CorsRulesResponse> cors() {
        return Optional.ofNullable(this.cors);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Protocol settings for file service
     * 
     */
    public Optional<ProtocolSettingsResponse> protocolSettings() {
        return Optional.ofNullable(this.protocolSettings);
    }
    /**
     * @return The file service properties for share soft delete.
     * 
     */
    public Optional<DeleteRetentionPolicyResponse> shareDeleteRetentionPolicy() {
        return Optional.ofNullable(this.shareDeleteRetentionPolicy);
    }
    /**
     * @return Sku name and tier.
     * 
     */
    public SkuResponse sku() {
        return this.sku;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileServicePropertiesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CorsRulesResponse cors;
        private String id;
        private String name;
        private @Nullable ProtocolSettingsResponse protocolSettings;
        private @Nullable DeleteRetentionPolicyResponse shareDeleteRetentionPolicy;
        private SkuResponse sku;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFileServicePropertiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cors = defaults.cors;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.shareDeleteRetentionPolicy = defaults.shareDeleteRetentionPolicy;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
        }

        public Builder cors(@Nullable CorsRulesResponse cors) {
            this.cors = cors;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protocolSettings(@Nullable ProtocolSettingsResponse protocolSettings) {
            this.protocolSettings = protocolSettings;
            return this;
        }
        public Builder shareDeleteRetentionPolicy(@Nullable DeleteRetentionPolicyResponse shareDeleteRetentionPolicy) {
            this.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
            return this;
        }
        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetFileServicePropertiesResult build() {
            return new GetFileServicePropertiesResult(cors, id, name, protocolSettings, shareDeleteRetentionPolicy, sku, type);
        }
    }
}
