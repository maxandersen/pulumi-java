// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.EncryptionPreferencesResponse;
import io.pulumi.azurenative.databox.outputs.TransportPreferencesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreferencesResponse {
    /**
     * Preferences related to the Encryption.
     * 
     */
    private final @Nullable EncryptionPreferencesResponse encryptionPreferences;
    /**
     * Preferred data center region.
     * 
     */
    private final @Nullable List<String> preferredDataCenterRegion;
    /**
     * Preferences related to the shipment logistics of the sku.
     * 
     */
    private final @Nullable TransportPreferencesResponse transportPreferences;

    @CustomType.Constructor
    private PreferencesResponse(
        @CustomType.Parameter("encryptionPreferences") @Nullable EncryptionPreferencesResponse encryptionPreferences,
        @CustomType.Parameter("preferredDataCenterRegion") @Nullable List<String> preferredDataCenterRegion,
        @CustomType.Parameter("transportPreferences") @Nullable TransportPreferencesResponse transportPreferences) {
        this.encryptionPreferences = encryptionPreferences;
        this.preferredDataCenterRegion = preferredDataCenterRegion;
        this.transportPreferences = transportPreferences;
    }

    /**
     * Preferences related to the Encryption.
     * 
    */
    public Optional<EncryptionPreferencesResponse> encryptionPreferences() {
        return Optional.ofNullable(this.encryptionPreferences);
    }
    /**
     * Preferred data center region.
     * 
    */
    public List<String> preferredDataCenterRegion() {
        return this.preferredDataCenterRegion == null ? List.of() : this.preferredDataCenterRegion;
    }
    /**
     * Preferences related to the shipment logistics of the sku.
     * 
    */
    public Optional<TransportPreferencesResponse> transportPreferences() {
        return Optional.ofNullable(this.transportPreferences);
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
