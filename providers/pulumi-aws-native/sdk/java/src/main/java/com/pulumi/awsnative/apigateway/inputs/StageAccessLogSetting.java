// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies settings for logging access in this stage.
 * 
 */
public final class StageAccessLogSetting extends com.pulumi.resources.InvokeArgs {

    public static final StageAccessLogSetting Empty = new StageAccessLogSetting();

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with amazon-apigateway-. This parameter is required to enable access logging.
     * 
     */
    @Import(name="destinationArn")
    private @Nullable String destinationArn;

    public Optional<String> destinationArn() {
        return Optional.ofNullable(this.destinationArn);
    }

    /**
     * A single line format of the access logs of data, as specified by selected $context variables (https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference). The format must include at least $context.requestId. This parameter is required to enable access logging.
     * 
     */
    @Import(name="format")
    private @Nullable String format;

    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }

    private StageAccessLogSetting() {}

    private StageAccessLogSetting(StageAccessLogSetting $) {
        this.destinationArn = $.destinationArn;
        this.format = $.format;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageAccessLogSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageAccessLogSetting $;

        public Builder() {
            $ = new StageAccessLogSetting();
        }

        public Builder(StageAccessLogSetting defaults) {
            $ = new StageAccessLogSetting(Objects.requireNonNull(defaults));
        }

        public Builder destinationArn(@Nullable String destinationArn) {
            $.destinationArn = destinationArn;
            return this;
        }

        public Builder format(@Nullable String format) {
            $.format = format;
            return this;
        }

        public StageAccessLogSetting build() {
            return $;
        }
    }

}
