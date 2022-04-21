// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.VirtualDirectoryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual application in an app.
 * 
 */
public final class VirtualApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualApplicationArgs Empty = new VirtualApplicationArgs();

    /**
     * Physical path.
     * 
     */
    @Import(name="physicalPath")
    private @Nullable Output<String> physicalPath;

    public Optional<Output<String>> physicalPath() {
        return Optional.ofNullable(this.physicalPath);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; if preloading is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="preloadEnabled")
    private @Nullable Output<Boolean> preloadEnabled;

    public Optional<Output<Boolean>> preloadEnabled() {
        return Optional.ofNullable(this.preloadEnabled);
    }

    /**
     * Virtual directories for virtual application.
     * 
     */
    @Import(name="virtualDirectories")
    private @Nullable Output<List<VirtualDirectoryArgs>> virtualDirectories;

    public Optional<Output<List<VirtualDirectoryArgs>>> virtualDirectories() {
        return Optional.ofNullable(this.virtualDirectories);
    }

    /**
     * Virtual path.
     * 
     */
    @Import(name="virtualPath")
    private @Nullable Output<String> virtualPath;

    public Optional<Output<String>> virtualPath() {
        return Optional.ofNullable(this.virtualPath);
    }

    private VirtualApplicationArgs() {}

    private VirtualApplicationArgs(VirtualApplicationArgs $) {
        this.physicalPath = $.physicalPath;
        this.preloadEnabled = $.preloadEnabled;
        this.virtualDirectories = $.virtualDirectories;
        this.virtualPath = $.virtualPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualApplicationArgs $;

        public Builder() {
            $ = new VirtualApplicationArgs();
        }

        public Builder(VirtualApplicationArgs defaults) {
            $ = new VirtualApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder physicalPath(@Nullable Output<String> physicalPath) {
            $.physicalPath = physicalPath;
            return this;
        }

        public Builder physicalPath(String physicalPath) {
            return physicalPath(Output.of(physicalPath));
        }

        public Builder preloadEnabled(@Nullable Output<Boolean> preloadEnabled) {
            $.preloadEnabled = preloadEnabled;
            return this;
        }

        public Builder preloadEnabled(Boolean preloadEnabled) {
            return preloadEnabled(Output.of(preloadEnabled));
        }

        public Builder virtualDirectories(@Nullable Output<List<VirtualDirectoryArgs>> virtualDirectories) {
            $.virtualDirectories = virtualDirectories;
            return this;
        }

        public Builder virtualDirectories(List<VirtualDirectoryArgs> virtualDirectories) {
            return virtualDirectories(Output.of(virtualDirectories));
        }

        public Builder virtualDirectories(VirtualDirectoryArgs... virtualDirectories) {
            return virtualDirectories(List.of(virtualDirectories));
        }

        public Builder virtualPath(@Nullable Output<String> virtualPath) {
            $.virtualPath = virtualPath;
            return this;
        }

        public Builder virtualPath(String virtualPath) {
            return virtualPath(Output.of(virtualPath));
        }

        public VirtualApplicationArgs build() {
            return $;
        }
    }

}
