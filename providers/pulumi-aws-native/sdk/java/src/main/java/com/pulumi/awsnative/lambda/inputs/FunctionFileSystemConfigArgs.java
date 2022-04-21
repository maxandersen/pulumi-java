// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FunctionFileSystemConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionFileSystemConfigArgs Empty = new FunctionFileSystemConfigArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The path where the function can access the file system, starting with /mnt/.
     * 
     */
    @Import(name="localMountPath", required=true)
    private Output<String> localMountPath;

    public Output<String> localMountPath() {
        return this.localMountPath;
    }

    private FunctionFileSystemConfigArgs() {}

    private FunctionFileSystemConfigArgs(FunctionFileSystemConfigArgs $) {
        this.arn = $.arn;
        this.localMountPath = $.localMountPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionFileSystemConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionFileSystemConfigArgs $;

        public Builder() {
            $ = new FunctionFileSystemConfigArgs();
        }

        public Builder(FunctionFileSystemConfigArgs defaults) {
            $ = new FunctionFileSystemConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder localMountPath(Output<String> localMountPath) {
            $.localMountPath = localMountPath;
            return this;
        }

        public Builder localMountPath(String localMountPath) {
            return localMountPath(Output.of(localMountPath));
        }

        public FunctionFileSystemConfigArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.localMountPath = Objects.requireNonNull($.localMountPath, "expected parameter 'localMountPath' to be non-null");
            return $;
        }
    }

}
