// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AptSettingsResponse {
    /**
     * List of packages to exclude from update. These packages will be excluded
     * 
     */
    private final List<String> excludes;
    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field cannot be specified with any other patch configuration fields.
     * 
     */
    private final List<String> exclusivePackages;
    /**
     * By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AptSettingsResponse(
        @CustomType.Parameter("excludes") List<String> excludes,
        @CustomType.Parameter("exclusivePackages") List<String> exclusivePackages,
        @CustomType.Parameter("type") String type) {
        this.excludes = excludes;
        this.exclusivePackages = exclusivePackages;
        this.type = type;
    }

    /**
     * List of packages to exclude from update. These packages will be excluded
     * 
    */
    public List<String> excludes() {
        return this.excludes;
    }
    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field cannot be specified with any other patch configuration fields.
     * 
    */
    public List<String> exclusivePackages() {
        return this.exclusivePackages;
    }
    /**
     * By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AptSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> excludes;
        private List<String> exclusivePackages;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AptSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.exclusivePackages = defaults.exclusivePackages;
    	      this.type = defaults.type;
        }

        public Builder excludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }
        public Builder exclusivePackages(List<String> exclusivePackages) {
            this.exclusivePackages = Objects.requireNonNull(exclusivePackages);
            return this;
        }
        public Builder exclusivePackages(String... exclusivePackages) {
            return exclusivePackages(List.of(exclusivePackages));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AptSettingsResponse build() {
            return new AptSettingsResponse(excludes, exclusivePackages, type);
        }
    }
}
