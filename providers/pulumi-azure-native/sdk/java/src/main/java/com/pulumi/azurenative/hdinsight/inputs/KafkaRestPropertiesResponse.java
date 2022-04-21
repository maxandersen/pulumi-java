// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.inputs.ClientGroupInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The kafka rest proxy configuration which contains AAD security group information.
 * 
 */
public final class KafkaRestPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final KafkaRestPropertiesResponse Empty = new KafkaRestPropertiesResponse();

    /**
     * The information of AAD security group.
     * 
     */
    @Import(name="clientGroupInfo")
    private @Nullable ClientGroupInfoResponse clientGroupInfo;

    public Optional<ClientGroupInfoResponse> clientGroupInfo() {
        return Optional.ofNullable(this.clientGroupInfo);
    }

    /**
     * The configurations that need to be overriden.
     * 
     */
    @Import(name="configurationOverride")
    private @Nullable Map<String,String> configurationOverride;

    public Optional<Map<String,String>> configurationOverride() {
        return Optional.ofNullable(this.configurationOverride);
    }

    private KafkaRestPropertiesResponse() {}

    private KafkaRestPropertiesResponse(KafkaRestPropertiesResponse $) {
        this.clientGroupInfo = $.clientGroupInfo;
        this.configurationOverride = $.configurationOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaRestPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaRestPropertiesResponse $;

        public Builder() {
            $ = new KafkaRestPropertiesResponse();
        }

        public Builder(KafkaRestPropertiesResponse defaults) {
            $ = new KafkaRestPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder clientGroupInfo(@Nullable ClientGroupInfoResponse clientGroupInfo) {
            $.clientGroupInfo = clientGroupInfo;
            return this;
        }

        public Builder configurationOverride(@Nullable Map<String,String> configurationOverride) {
            $.configurationOverride = configurationOverride;
            return this;
        }

        public KafkaRestPropertiesResponse build() {
            return $;
        }
    }

}
