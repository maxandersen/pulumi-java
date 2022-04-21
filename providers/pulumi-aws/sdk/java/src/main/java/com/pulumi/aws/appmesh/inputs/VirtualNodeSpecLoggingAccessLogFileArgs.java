// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecLoggingAccessLogFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecLoggingAccessLogFileArgs Empty = new VirtualNodeSpecLoggingAccessLogFileArgs();

    /**
     * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    private VirtualNodeSpecLoggingAccessLogFileArgs() {}

    private VirtualNodeSpecLoggingAccessLogFileArgs(VirtualNodeSpecLoggingAccessLogFileArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecLoggingAccessLogFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecLoggingAccessLogFileArgs $;

        public Builder() {
            $ = new VirtualNodeSpecLoggingAccessLogFileArgs();
        }

        public Builder(VirtualNodeSpecLoggingAccessLogFileArgs defaults) {
            $ = new VirtualNodeSpecLoggingAccessLogFileArgs(Objects.requireNonNull(defaults));
        }

        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public VirtualNodeSpecLoggingAccessLogFileArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
