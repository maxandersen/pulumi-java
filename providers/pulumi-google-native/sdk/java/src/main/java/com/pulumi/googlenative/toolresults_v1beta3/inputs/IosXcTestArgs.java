// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A test of an iOS application that uses the XCTest framework.
 * 
 */
public final class IosXcTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final IosXcTestArgs Empty = new IosXcTestArgs();

    /**
     * Bundle ID of the app.
     * 
     */
    @Import(name="bundleId")
      private final @Nullable Output<String> bundleId;

    public Output<String> bundleId() {
        return this.bundleId == null ? Codegen.empty() : this.bundleId;
    }

    /**
     * Xcode version that the test was run with.
     * 
     */
    @Import(name="xcodeVersion")
      private final @Nullable Output<String> xcodeVersion;

    public Output<String> xcodeVersion() {
        return this.xcodeVersion == null ? Codegen.empty() : this.xcodeVersion;
    }

    public IosXcTestArgs(
        @Nullable Output<String> bundleId,
        @Nullable Output<String> xcodeVersion) {
        this.bundleId = bundleId;
        this.xcodeVersion = xcodeVersion;
    }

    private IosXcTestArgs() {
        this.bundleId = Codegen.empty();
        this.xcodeVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosXcTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bundleId;
        private @Nullable Output<String> xcodeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(IosXcTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.xcodeVersion = defaults.xcodeVersion;
        }

        public Builder bundleId(@Nullable Output<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public Builder bundleId(@Nullable String bundleId) {
            this.bundleId = Codegen.ofNullable(bundleId);
            return this;
        }
        public Builder xcodeVersion(@Nullable Output<String> xcodeVersion) {
            this.xcodeVersion = xcodeVersion;
            return this;
        }
        public Builder xcodeVersion(@Nullable String xcodeVersion) {
            this.xcodeVersion = Codegen.ofNullable(xcodeVersion);
            return this;
        }        public IosXcTestArgs build() {
            return new IosXcTestArgs(bundleId, xcodeVersion);
        }
    }
}
