// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a single version.
 * 
 */
public final class SecretVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretVersionArgs Empty = new SecretVersionArgs();

    /**
     * Relative path of the file under the mount path where the secret value for this version will be fetched and made available. For example, setting the mount_path as &#39;/etc/secrets&#39; and path as `/secret_foo` would mount the secret value file at `/etc/secrets/secret_foo`.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Version of the secret (version number or the string &#39;latest&#39;). It is preferrable to use `latest` version with secret volumes as secret value changes are reflected immediately.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public SecretVersionArgs(
        @Nullable Output<String> path,
        @Nullable Output<String> version) {
        this.path = path;
        this.version = version;
    }

    private SecretVersionArgs() {
        this.path = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> path;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.version = defaults.version;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public SecretVersionArgs build() {
            return new SecretVersionArgs(path, version);
        }
    }
}
