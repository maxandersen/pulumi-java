// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceExecResourceResponse;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileResourceResponse;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceResponse;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceRepositoryResourceResponse;
import java.util.Objects;


/**
 * An OS policy resource is used to define the desired state configuration and provides a specific functionality like installing/removing packages, executing a script etc. The system ensures that resources are always in their desired state by taking necessary actions if they have drifted from their desired state.
 * 
 */
public final class OSPolicyResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceResponse Empty = new OSPolicyResourceResponse();

    /**
     * Exec resource
     * 
     */
    @Import(name="exec", required=true)
    private OSPolicyResourceExecResourceResponse exec;

    public OSPolicyResourceExecResourceResponse exec() {
        return this.exec;
    }

    /**
     * File resource
     * 
     */
    @Import(name="file", required=true)
    private OSPolicyResourceFileResourceResponse file;

    public OSPolicyResourceFileResourceResponse file() {
        return this.file;
    }

    /**
     * Package resource
     * 
     */
    @Import(name="pkg", required=true)
    private OSPolicyResourcePackageResourceResponse pkg;

    public OSPolicyResourcePackageResourceResponse pkg() {
        return this.pkg;
    }

    /**
     * Package repository resource
     * 
     */
    @Import(name="repository", required=true)
    private OSPolicyResourceRepositoryResourceResponse repository;

    public OSPolicyResourceRepositoryResourceResponse repository() {
        return this.repository;
    }

    private OSPolicyResourceResponse() {}

    private OSPolicyResourceResponse(OSPolicyResourceResponse $) {
        this.exec = $.exec;
        this.file = $.file;
        this.pkg = $.pkg;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceResponse $;

        public Builder() {
            $ = new OSPolicyResourceResponse();
        }

        public Builder(OSPolicyResourceResponse defaults) {
            $ = new OSPolicyResourceResponse(Objects.requireNonNull(defaults));
        }

        public Builder exec(OSPolicyResourceExecResourceResponse exec) {
            $.exec = exec;
            return this;
        }

        public Builder file(OSPolicyResourceFileResourceResponse file) {
            $.file = file;
            return this;
        }

        public Builder pkg(OSPolicyResourcePackageResourceResponse pkg) {
            $.pkg = pkg;
            return this;
        }

        public Builder repository(OSPolicyResourceRepositoryResourceResponse repository) {
            $.repository = repository;
            return this;
        }

        public OSPolicyResourceResponse build() {
            $.exec = Objects.requireNonNull($.exec, "expected parameter 'exec' to be non-null");
            $.file = Objects.requireNonNull($.file, "expected parameter 'file' to be non-null");
            $.pkg = Objects.requireNonNull($.pkg, "expected parameter 'pkg' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
