// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Http logs to azure blob storage configuration.
 * 
 */
public final class AzureBlobStorageHttpLogsConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureBlobStorageHttpLogsConfigResponse Empty = new AzureBlobStorageHttpLogsConfigResponse();

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * Retention in days.
     * Remove blobs older than X days.
     * 0 or lower means no retention.
     * 
     */
    @Import(name="retentionInDays")
      private final @Nullable Integer retentionInDays;

    public Optional<Integer> retentionInDays() {
        return this.retentionInDays == null ? Optional.empty() : Optional.ofNullable(this.retentionInDays);
    }

    /**
     * SAS url to a azure blob container with read/write/list/delete permissions.
     * 
     */
    @Import(name="sasUrl")
      private final @Nullable String sasUrl;

    public Optional<String> sasUrl() {
        return this.sasUrl == null ? Optional.empty() : Optional.ofNullable(this.sasUrl);
    }

    public AzureBlobStorageHttpLogsConfigResponse(
        @Nullable Boolean enabled,
        @Nullable Integer retentionInDays,
        @Nullable String sasUrl) {
        this.enabled = enabled;
        this.retentionInDays = retentionInDays;
        this.sasUrl = sasUrl;
    }

    private AzureBlobStorageHttpLogsConfigResponse() {
        this.enabled = null;
        this.retentionInDays = null;
        this.sasUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageHttpLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer retentionInDays;
        private @Nullable String sasUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageHttpLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.sasUrl = defaults.sasUrl;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }
        public Builder sasUrl(@Nullable String sasUrl) {
            this.sasUrl = sasUrl;
            return this;
        }        public AzureBlobStorageHttpLogsConfigResponse build() {
            return new AzureBlobStorageHttpLogsConfigResponse(enabled, retentionInDays, sasUrl);
        }
    }
}
