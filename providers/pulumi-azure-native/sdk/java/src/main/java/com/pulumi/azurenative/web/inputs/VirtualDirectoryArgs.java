// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Directory for virtual application.
 * 
 */
public final class VirtualDirectoryArgs extends ResourceArgs {

    public static final VirtualDirectoryArgs Empty = new VirtualDirectoryArgs();

    /**
     * Physical path.
     * 
     */
    @Import(name="physicalPath")
    private @Nullable Output<String> physicalPath;

    /**
     * @return Physical path.
     * 
     */
    public Optional<Output<String>> physicalPath() {
        return Optional.ofNullable(this.physicalPath);
    }

    /**
     * Path to virtual application.
     * 
     */
    @Import(name="virtualPath")
    private @Nullable Output<String> virtualPath;

    /**
     * @return Path to virtual application.
     * 
     */
    public Optional<Output<String>> virtualPath() {
        return Optional.ofNullable(this.virtualPath);
    }

    private VirtualDirectoryArgs() {}

    private VirtualDirectoryArgs(VirtualDirectoryArgs $) {
        this.physicalPath = $.physicalPath;
        this.virtualPath = $.virtualPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualDirectoryArgs $;

        public Builder() {
            $ = new VirtualDirectoryArgs();
        }

        public Builder(VirtualDirectoryArgs defaults) {
            $ = new VirtualDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param physicalPath Physical path.
         * 
         * @return builder
         * 
         */
        public Builder physicalPath(@Nullable Output<String> physicalPath) {
            $.physicalPath = physicalPath;
            return this;
        }

        /**
         * @param physicalPath Physical path.
         * 
         * @return builder
         * 
         */
        public Builder physicalPath(String physicalPath) {
            return physicalPath(Output.of(physicalPath));
        }

        /**
         * @param virtualPath Path to virtual application.
         * 
         * @return builder
         * 
         */
        public Builder virtualPath(@Nullable Output<String> virtualPath) {
            $.virtualPath = virtualPath;
            return this;
        }

        /**
         * @param virtualPath Path to virtual application.
         * 
         * @return builder
         * 
         */
        public Builder virtualPath(String virtualPath) {
            return virtualPath(Output.of(virtualPath));
        }

        public VirtualDirectoryArgs build() {
            return $;
        }
    }

}
