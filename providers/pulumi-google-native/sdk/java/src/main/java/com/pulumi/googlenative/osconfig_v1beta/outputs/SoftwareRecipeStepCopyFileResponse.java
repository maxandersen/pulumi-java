// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SoftwareRecipeStepCopyFileResponse {
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;
    /**
     * The absolute path on the instance to put the file.
     * 
     */
    private final String destination;
    /**
     * Whether to allow this step to overwrite existing files. If this is false and the file already exists the file is not overwritten and the step is considered a success. Defaults to false.
     * 
     */
    private final Boolean overwrite;
    /**
     * Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users for the file (similarly to the numeric mode used in the linux chmod utility). Each digit represents a three bit number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission. Default behavior is 755. Below are some examples of permissions and their associated values: read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
     * 
     */
    private final String permissions;

    @CustomType.Constructor
    private SoftwareRecipeStepCopyFileResponse(
        @CustomType.Parameter("artifactId") String artifactId,
        @CustomType.Parameter("destination") String destination,
        @CustomType.Parameter("overwrite") Boolean overwrite,
        @CustomType.Parameter("permissions") String permissions) {
        this.artifactId = artifactId;
        this.destination = destination;
        this.overwrite = overwrite;
        this.permissions = permissions;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
    */
    public String artifactId() {
        return this.artifactId;
    }
    /**
     * The absolute path on the instance to put the file.
     * 
    */
    public String destination() {
        return this.destination;
    }
    /**
     * Whether to allow this step to overwrite existing files. If this is false and the file already exists the file is not overwritten and the step is considered a success. Defaults to false.
     * 
    */
    public Boolean overwrite() {
        return this.overwrite;
    }
    /**
     * Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users for the file (similarly to the numeric mode used in the linux chmod utility). Each digit represents a three bit number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission. Default behavior is 755. Below are some examples of permissions and their associated values: read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
     * 
    */
    public String permissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepCopyFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactId;
        private String destination;
        private Boolean overwrite;
        private String permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepCopyFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.destination = defaults.destination;
    	      this.overwrite = defaults.overwrite;
    	      this.permissions = defaults.permissions;
        }

        public Builder artifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder overwrite(Boolean overwrite) {
            this.overwrite = Objects.requireNonNull(overwrite);
            return this;
        }
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }        public SoftwareRecipeStepCopyFileResponse build() {
            return new SoftwareRecipeStepCopyFileResponse(artifactId, destination, overwrite, permissions);
        }
    }
}
