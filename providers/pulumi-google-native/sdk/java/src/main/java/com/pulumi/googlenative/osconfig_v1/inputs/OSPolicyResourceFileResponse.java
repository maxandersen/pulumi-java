// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileGcsResponse;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileRemoteResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A remote or local file.
 * 
 */
public final class OSPolicyResourceFileResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceFileResponse Empty = new OSPolicyResourceFileResponse();

    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure", required=true)
      private final Boolean allowInsecure;

    public Boolean allowInsecure() {
        return this.allowInsecure;
    }

    /**
     * A Cloud Storage object.
     * 
     */
    @Import(name="gcs", required=true)
      private final OSPolicyResourceFileGcsResponse gcs;

    public OSPolicyResourceFileGcsResponse gcs() {
        return this.gcs;
    }

    /**
     * A local path within the VM to use.
     * 
     */
    @Import(name="localPath", required=true)
      private final String localPath;

    public String localPath() {
        return this.localPath;
    }

    /**
     * A generic remote file.
     * 
     */
    @Import(name="remote", required=true)
      private final OSPolicyResourceFileRemoteResponse remote;

    public OSPolicyResourceFileRemoteResponse remote() {
        return this.remote;
    }

    public OSPolicyResourceFileResponse(
        Boolean allowInsecure,
        OSPolicyResourceFileGcsResponse gcs,
        String localPath,
        OSPolicyResourceFileRemoteResponse remote) {
        this.allowInsecure = Objects.requireNonNull(allowInsecure, "expected parameter 'allowInsecure' to be non-null");
        this.gcs = Objects.requireNonNull(gcs, "expected parameter 'gcs' to be non-null");
        this.localPath = Objects.requireNonNull(localPath, "expected parameter 'localPath' to be non-null");
        this.remote = Objects.requireNonNull(remote, "expected parameter 'remote' to be non-null");
    }

    private OSPolicyResourceFileResponse() {
        this.allowInsecure = null;
        this.gcs = null;
        this.localPath = null;
        this.remote = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowInsecure;
        private OSPolicyResourceFileGcsResponse gcs;
        private String localPath;
        private OSPolicyResourceFileRemoteResponse remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(Boolean allowInsecure) {
            this.allowInsecure = Objects.requireNonNull(allowInsecure);
            return this;
        }
        public Builder gcs(OSPolicyResourceFileGcsResponse gcs) {
            this.gcs = Objects.requireNonNull(gcs);
            return this;
        }
        public Builder localPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }
        public Builder remote(OSPolicyResourceFileRemoteResponse remote) {
            this.remote = Objects.requireNonNull(remote);
            return this;
        }        public OSPolicyResourceFileResponse build() {
            return new OSPolicyResourceFileResponse(allowInsecure, gcs, localPath, remote);
        }
    }
}
