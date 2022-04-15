// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GlusterFsSectionResponse {
    /**
     * The server address of one of the servers that hosts the GlusterFS. Can be either the IP address or server name.
     * 
     */
    private final String serverAddress;
    /**
     * The name of the created GlusterFS volume.
     * 
     */
    private final String volumeName;

    @CustomType.Constructor
    private GlusterFsSectionResponse(
        @CustomType.Parameter("serverAddress") String serverAddress,
        @CustomType.Parameter("volumeName") String volumeName) {
        this.serverAddress = serverAddress;
        this.volumeName = volumeName;
    }

    /**
     * The server address of one of the servers that hosts the GlusterFS. Can be either the IP address or server name.
     * 
    */
    public String serverAddress() {
        return this.serverAddress;
    }
    /**
     * The name of the created GlusterFS volume.
     * 
    */
    public String volumeName() {
        return this.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlusterFsSectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serverAddress;
        private String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GlusterFsSectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverAddress = defaults.serverAddress;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder serverAddress(String serverAddress) {
            this.serverAddress = Objects.requireNonNull(serverAddress);
            return this;
        }
        public Builder volumeName(String volumeName) {
            this.volumeName = Objects.requireNonNull(volumeName);
            return this;
        }        public GlusterFsSectionResponse build() {
            return new GlusterFsSectionResponse(serverAddress, volumeName);
        }
    }
}
