// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Maps a string key to a path within a volume.
 * 
 */
public final class KeyToPathArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyToPathArgs Empty = new KeyToPathArgs();

    /**
     * The Cloud Secret Manager secret version. Can be &#39;latest&#39; for the latest value or an integer for a specific version. The key to project.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * (Optional) Mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume&#39;s default mode will be used. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<Integer> mode;

    public Output<Integer> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    public KeyToPathArgs(
        @Nullable Output<String> key,
        @Nullable Output<Integer> mode,
        @Nullable Output<String> path) {
        this.key = key;
        this.mode = mode;
        this.path = path;
    }

    private KeyToPathArgs() {
        this.key = Codegen.empty();
        this.mode = Codegen.empty();
        this.path = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyToPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<Integer> mode;
        private @Nullable Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyToPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder mode(@Nullable Output<Integer> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable Integer mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }        public KeyToPathArgs build() {
            return new KeyToPathArgs(key, mode, path);
        }
    }
}
