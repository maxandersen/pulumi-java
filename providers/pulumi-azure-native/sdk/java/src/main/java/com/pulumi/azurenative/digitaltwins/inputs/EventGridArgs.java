// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.inputs;

import com.pulumi.azurenative.digitaltwins.enums.AuthenticationType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties related to EventGrid.
 * 
 */
public final class EventGridArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventGridArgs Empty = new EventGridArgs();

    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    @Import(name="accessKey1", required=true)
    private Output<String> accessKey1;

    public Output<String> accessKey1() {
        return this.accessKey1;
    }

    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    @Import(name="accessKey2")
    private @Nullable Output<String> accessKey2;

    public Optional<Output<String>> accessKey2() {
        return Optional.ofNullable(this.accessKey2);
    }

    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<Either<String,AuthenticationType>> authenticationType;

    public Optional<Output<Either<String,AuthenticationType>>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    @Import(name="deadLetterSecret")
    private @Nullable Output<String> deadLetterSecret;

    public Optional<Output<String>> deadLetterSecret() {
        return Optional.ofNullable(this.deadLetterSecret);
    }

    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    @Import(name="deadLetterUri")
    private @Nullable Output<String> deadLetterUri;

    public Optional<Output<String>> deadLetterUri() {
        return Optional.ofNullable(this.deadLetterUri);
    }

    /**
     * The type of Digital Twins endpoint
     * Expected value is &#39;EventGrid&#39;.
     * 
     */
    @Import(name="endpointType", required=true)
    private Output<String> endpointType;

    public Output<String> endpointType() {
        return this.endpointType;
    }

    /**
     * EventGrid Topic Endpoint
     * 
     */
    @Import(name="topicEndpoint", required=true)
    private Output<String> topicEndpoint;

    public Output<String> topicEndpoint() {
        return this.topicEndpoint;
    }

    private EventGridArgs() {}

    private EventGridArgs(EventGridArgs $) {
        this.accessKey1 = $.accessKey1;
        this.accessKey2 = $.accessKey2;
        this.authenticationType = $.authenticationType;
        this.deadLetterSecret = $.deadLetterSecret;
        this.deadLetterUri = $.deadLetterUri;
        this.endpointType = $.endpointType;
        this.topicEndpoint = $.topicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventGridArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventGridArgs $;

        public Builder() {
            $ = new EventGridArgs();
        }

        public Builder(EventGridArgs defaults) {
            $ = new EventGridArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKey1(Output<String> accessKey1) {
            $.accessKey1 = accessKey1;
            return this;
        }

        public Builder accessKey1(String accessKey1) {
            return accessKey1(Output.of(accessKey1));
        }

        public Builder accessKey2(@Nullable Output<String> accessKey2) {
            $.accessKey2 = accessKey2;
            return this;
        }

        public Builder accessKey2(String accessKey2) {
            return accessKey2(Output.of(accessKey2));
        }

        public Builder authenticationType(@Nullable Output<Either<String,AuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(Either<String,AuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder deadLetterSecret(@Nullable Output<String> deadLetterSecret) {
            $.deadLetterSecret = deadLetterSecret;
            return this;
        }

        public Builder deadLetterSecret(String deadLetterSecret) {
            return deadLetterSecret(Output.of(deadLetterSecret));
        }

        public Builder deadLetterUri(@Nullable Output<String> deadLetterUri) {
            $.deadLetterUri = deadLetterUri;
            return this;
        }

        public Builder deadLetterUri(String deadLetterUri) {
            return deadLetterUri(Output.of(deadLetterUri));
        }

        public Builder endpointType(Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        public Builder topicEndpoint(Output<String> topicEndpoint) {
            $.topicEndpoint = topicEndpoint;
            return this;
        }

        public Builder topicEndpoint(String topicEndpoint) {
            return topicEndpoint(Output.of(topicEndpoint));
        }

        public EventGridArgs build() {
            $.accessKey1 = Objects.requireNonNull($.accessKey1, "expected parameter 'accessKey1' to be non-null");
            $.endpointType = Codegen.stringProp("endpointType").output().arg($.endpointType).require();
            $.topicEndpoint = Objects.requireNonNull($.topicEndpoint, "expected parameter 'topicEndpoint' to be non-null");
            return $;
        }
    }

}
