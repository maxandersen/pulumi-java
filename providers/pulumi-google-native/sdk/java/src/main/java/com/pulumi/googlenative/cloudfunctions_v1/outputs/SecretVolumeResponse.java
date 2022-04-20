// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudfunctions_v1.outputs.SecretVersionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SecretVolumeResponse {
    /**
     * The path within the container to mount the secret volume. For example, setting the mount_path as `/etc/secrets` would mount the secret value files under the `/etc/secrets` directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount paths: /etc/secrets Restricted mount paths: /cloudsql, /dev/log, /pod, /proc, /var/log
     * 
     */
    private final String mountPath;
    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
     */
    private final String project;
    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
     */
    private final String secret;
    /**
     * List of secret versions to mount for this secret. If empty, the `latest` version of the secret will be made available in a file named after the secret under the mount point.
     * 
     */
    private final List<SecretVersionResponse> versions;

    @CustomType.Constructor
    private SecretVolumeResponse(
        @CustomType.Parameter("mountPath") String mountPath,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("secret") String secret,
        @CustomType.Parameter("versions") List<SecretVersionResponse> versions) {
        this.mountPath = mountPath;
        this.project = project;
        this.secret = secret;
        this.versions = versions;
    }

    /**
     * The path within the container to mount the secret volume. For example, setting the mount_path as `/etc/secrets` would mount the secret value files under the `/etc/secrets` directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount paths: /etc/secrets Restricted mount paths: /cloudsql, /dev/log, /pod, /proc, /var/log
     * 
    */
    public String mountPath() {
        return this.mountPath;
    }
    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
    */
    public String project() {
        return this.project;
    }
    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
    */
    public String secret() {
        return this.secret;
    }
    /**
     * List of secret versions to mount for this secret. If empty, the `latest` version of the secret will be made available in a file named after the secret under the mount point.
     * 
    */
    public List<SecretVersionResponse> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String project;
        private String secret;
        private List<SecretVersionResponse> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.versions = defaults.versions;
        }

        public Builder mountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public Builder versions(List<SecretVersionResponse> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(SecretVersionResponse... versions) {
            return versions(List.of(versions));
        }        public SecretVolumeResponse build() {
            return new SecretVolumeResponse(mountPath, project, secret, versions);
        }
    }
}
