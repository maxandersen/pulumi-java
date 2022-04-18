// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A resource that manages the state of a file.
 * 
 */
public final class OSPolicyResourceFileResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceFileResourceResponse Empty = new OSPolicyResourceFileResourceResponse();

    /**
     * A a file with this content. The size of the content is limited to 1024 characters.
     * 
     */
    @Import(name="content", required=true)
      private final String content;

    public String content() {
        return this.content;
    }

    /**
     * A remote or local source.
     * 
     */
    @Import(name="file", required=true)
      private final OSPolicyResourceFileResponse file;

    public OSPolicyResourceFileResponse file() {
        return this.file;
    }

    /**
     * The absolute path of the file within the VM.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String path() {
        return this.path;
    }

    /**
     * Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users for the file (similarly to the numeric mode used in the linux chmod utility). Each digit represents a three bit number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission. Default behavior is 755. Below are some examples of permissions and their associated values: read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
     * 
     */
    @Import(name="permissions", required=true)
      private final String permissions;

    public String permissions() {
        return this.permissions;
    }

    /**
     * Desired state of the file.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    public OSPolicyResourceFileResourceResponse(
        String content,
        OSPolicyResourceFileResponse file,
        String path,
        String permissions,
        String state) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.file = Objects.requireNonNull(file, "expected parameter 'file' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private OSPolicyResourceFileResourceResponse() {
        this.content = null;
        this.file = null;
        this.path = null;
        this.permissions = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private OSPolicyResourceFileResponse file;
        private String path;
        private String permissions;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.file = defaults.file;
    	      this.path = defaults.path;
    	      this.permissions = defaults.permissions;
    	      this.state = defaults.state;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder file(OSPolicyResourceFileResponse file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public OSPolicyResourceFileResourceResponse build() {
            return new OSPolicyResourceFileResourceResponse(content, file, path, permissions, state);
        }
    }
}
