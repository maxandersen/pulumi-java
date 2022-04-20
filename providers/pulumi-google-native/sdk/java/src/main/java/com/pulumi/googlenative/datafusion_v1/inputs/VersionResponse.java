// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The Data Fusion version. This proto message stores information about certain Data Fusion version, which is used for Data Fusion version upgrade.
 * 
 */
public final class VersionResponse extends com.pulumi.resources.InvokeArgs {

    public static final VersionResponse Empty = new VersionResponse();

    /**
     * Represents a list of available feature names for a given version.
     * 
     */
    @Import(name="availableFeatures", required=true)
      private final List<String> availableFeatures;

    public List<String> availableFeatures() {
        return this.availableFeatures;
    }

    /**
     * Whether this is currently the default version for Cloud Data Fusion
     * 
     */
    @Import(name="defaultVersion", required=true)
      private final Boolean defaultVersion;

    public Boolean defaultVersion() {
        return this.defaultVersion;
    }

    /**
     * Type represents the release availability of the version
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The version number of the Data Fusion instance, such as &#39;6.0.1.0&#39;.
     * 
     */
    @Import(name="versionNumber", required=true)
      private final String versionNumber;

    public String versionNumber() {
        return this.versionNumber;
    }

    public VersionResponse(
        List<String> availableFeatures,
        Boolean defaultVersion,
        String type,
        String versionNumber) {
        this.availableFeatures = Objects.requireNonNull(availableFeatures, "expected parameter 'availableFeatures' to be non-null");
        this.defaultVersion = Objects.requireNonNull(defaultVersion, "expected parameter 'defaultVersion' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.versionNumber = Objects.requireNonNull(versionNumber, "expected parameter 'versionNumber' to be non-null");
    }

    private VersionResponse() {
        this.availableFeatures = List.of();
        this.defaultVersion = null;
        this.type = null;
        this.versionNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availableFeatures;
        private Boolean defaultVersion;
        private String type;
        private String versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableFeatures = defaults.availableFeatures;
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.type = defaults.type;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder availableFeatures(List<String> availableFeatures) {
            this.availableFeatures = Objects.requireNonNull(availableFeatures);
            return this;
        }
        public Builder availableFeatures(String... availableFeatures) {
            return availableFeatures(List.of(availableFeatures));
        }
        public Builder defaultVersion(Boolean defaultVersion) {
            this.defaultVersion = Objects.requireNonNull(defaultVersion);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder versionNumber(String versionNumber) {
            this.versionNumber = Objects.requireNonNull(versionNumber);
            return this;
        }        public VersionResponse build() {
            return new VersionResponse(availableFeatures, defaultVersion, type, versionNumber);
        }
    }
}
