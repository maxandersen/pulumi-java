// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.inputs;

import com.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorJsonFormatDescriptorFileCompression;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorJsonFormatDescriptorArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorJsonFormatDescriptorArgs Empty = new AnomalyDetectorJsonFormatDescriptorArgs();

    @Import(name="charset")
    private @Nullable Output<String> charset;

    public Optional<Output<String>> charset() {
        return Optional.ofNullable(this.charset);
    }

    @Import(name="fileCompression")
    private @Nullable Output<AnomalyDetectorJsonFormatDescriptorFileCompression> fileCompression;

    public Optional<Output<AnomalyDetectorJsonFormatDescriptorFileCompression>> fileCompression() {
        return Optional.ofNullable(this.fileCompression);
    }

    private AnomalyDetectorJsonFormatDescriptorArgs() {}

    private AnomalyDetectorJsonFormatDescriptorArgs(AnomalyDetectorJsonFormatDescriptorArgs $) {
        this.charset = $.charset;
        this.fileCompression = $.fileCompression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnomalyDetectorJsonFormatDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorJsonFormatDescriptorArgs $;

        public Builder() {
            $ = new AnomalyDetectorJsonFormatDescriptorArgs();
        }

        public Builder(AnomalyDetectorJsonFormatDescriptorArgs defaults) {
            $ = new AnomalyDetectorJsonFormatDescriptorArgs(Objects.requireNonNull(defaults));
        }

        public Builder charset(@Nullable Output<String> charset) {
            $.charset = charset;
            return this;
        }

        public Builder charset(String charset) {
            return charset(Output.of(charset));
        }

        public Builder fileCompression(@Nullable Output<AnomalyDetectorJsonFormatDescriptorFileCompression> fileCompression) {
            $.fileCompression = fileCompression;
            return this;
        }

        public Builder fileCompression(AnomalyDetectorJsonFormatDescriptorFileCompression fileCompression) {
            return fileCompression(Output.of(fileCompression));
        }

        public AnomalyDetectorJsonFormatDescriptorArgs build() {
            return $;
        }
    }

}
