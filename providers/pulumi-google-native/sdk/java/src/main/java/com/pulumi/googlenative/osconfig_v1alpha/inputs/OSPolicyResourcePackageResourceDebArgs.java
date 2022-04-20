// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceFileArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A deb package file. dpkg packages only support INSTALLED state.
 * 
 */
public final class OSPolicyResourcePackageResourceDebArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceDebArgs Empty = new OSPolicyResourcePackageResourceDebArgs();

    /**
     * Whether dependencies should also be installed. - install when false: `dpkg -i package` - install when true: `apt-get update &amp;&amp; apt-get -y install package.deb`
     * 
     */
    @Import(name="pullDeps")
      private final @Nullable Output<Boolean> pullDeps;

    public Output<Boolean> pullDeps() {
        return this.pullDeps == null ? Codegen.empty() : this.pullDeps;
    }

    /**
     * A deb package.
     * 
     */
    @Import(name="source", required=true)
      private final Output<OSPolicyResourceFileArgs> source;

    public Output<OSPolicyResourceFileArgs> source() {
        return this.source;
    }

    public OSPolicyResourcePackageResourceDebArgs(
        @Nullable Output<Boolean> pullDeps,
        Output<OSPolicyResourceFileArgs> source) {
        this.pullDeps = pullDeps;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OSPolicyResourcePackageResourceDebArgs() {
        this.pullDeps = Codegen.empty();
        this.source = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceDebArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> pullDeps;
        private Output<OSPolicyResourceFileArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceDebArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder pullDeps(@Nullable Output<Boolean> pullDeps) {
            this.pullDeps = pullDeps;
            return this;
        }
        public Builder pullDeps(@Nullable Boolean pullDeps) {
            this.pullDeps = Codegen.ofNullable(pullDeps);
            return this;
        }
        public Builder source(Output<OSPolicyResourceFileArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(OSPolicyResourceFileArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }        public OSPolicyResourcePackageResourceDebArgs build() {
            return new OSPolicyResourcePackageResourceDebArgs(pullDeps, source);
        }
    }
}
