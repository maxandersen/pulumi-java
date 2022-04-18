// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.EncryptionPreferencesResponse;
import com.pulumi.azurenative.databox.inputs.TransportPreferencesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Preferences related to the order
 * 
 */
public final class PreferencesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PreferencesResponse Empty = new PreferencesResponse();

    /**
     * Preferences related to the Encryption.
     * 
     */
    @Import(name="encryptionPreferences")
      private final @Nullable EncryptionPreferencesResponse encryptionPreferences;

    public Optional<EncryptionPreferencesResponse> encryptionPreferences() {
        return this.encryptionPreferences == null ? Optional.empty() : Optional.ofNullable(this.encryptionPreferences);
    }

    /**
     * Preferred data center region.
     * 
     */
    @Import(name="preferredDataCenterRegion")
      private final @Nullable List<String> preferredDataCenterRegion;

    public List<String> preferredDataCenterRegion() {
        return this.preferredDataCenterRegion == null ? List.of() : this.preferredDataCenterRegion;
    }

    /**
     * Preferences related to the shipment logistics of the sku.
     * 
     */
    @Import(name="transportPreferences")
      private final @Nullable TransportPreferencesResponse transportPreferences;

    public Optional<TransportPreferencesResponse> transportPreferences() {
        return this.transportPreferences == null ? Optional.empty() : Optional.ofNullable(this.transportPreferences);
    }

    public PreferencesResponse(
        @Nullable EncryptionPreferencesResponse encryptionPreferences,
        @Nullable List<String> preferredDataCenterRegion,
        @Nullable TransportPreferencesResponse transportPreferences) {
        this.encryptionPreferences = encryptionPreferences;
        this.preferredDataCenterRegion = preferredDataCenterRegion;
        this.transportPreferences = transportPreferences;
    }

    private PreferencesResponse() {
        this.encryptionPreferences = null;
        this.preferredDataCenterRegion = List.of();
        this.transportPreferences = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EncryptionPreferencesResponse encryptionPreferences;
        private @Nullable List<String> preferredDataCenterRegion;
        private @Nullable TransportPreferencesResponse transportPreferences;

        public Builder() {
    	      // Empty
        }

        public Builder(PreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionPreferences = defaults.encryptionPreferences;
    	      this.preferredDataCenterRegion = defaults.preferredDataCenterRegion;
    	      this.transportPreferences = defaults.transportPreferences;
        }

        public Builder encryptionPreferences(@Nullable EncryptionPreferencesResponse encryptionPreferences) {
            this.encryptionPreferences = encryptionPreferences;
            return this;
        }
        public Builder preferredDataCenterRegion(@Nullable List<String> preferredDataCenterRegion) {
            this.preferredDataCenterRegion = preferredDataCenterRegion;
            return this;
        }
        public Builder preferredDataCenterRegion(String... preferredDataCenterRegion) {
            return preferredDataCenterRegion(List.of(preferredDataCenterRegion));
        }
        public Builder transportPreferences(@Nullable TransportPreferencesResponse transportPreferences) {
            this.transportPreferences = transportPreferences;
            return this;
        }        public PreferencesResponse build() {
            return new PreferencesResponse(encryptionPreferences, preferredDataCenterRegion, transportPreferences);
        }
    }
}
