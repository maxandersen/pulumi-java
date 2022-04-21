// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.MediaGraphClearEndpointResponse;
import com.pulumi.azurenative.media.inputs.MediaGraphTlsEndpointResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * RTSP source.
 * 
 */
public final class MediaGraphRtspSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final MediaGraphRtspSourceResponse Empty = new MediaGraphRtspSourceResponse();

    /**
     * RTSP endpoint of the stream being connected to.
     * 
     */
    @Import(name="endpoint", required=true)
    private Either<MediaGraphClearEndpointResponse,MediaGraphTlsEndpointResponse> endpoint;

    public Either<MediaGraphClearEndpointResponse,MediaGraphTlsEndpointResponse> endpoint() {
        return this.endpoint;
    }

    /**
     * Source name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.MediaGraphRtspSource&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * Underlying RTSP transport. This can be used to enable or disable HTTP tunneling.
     * 
     */
    @Import(name="transport", required=true)
    private String transport;

    public String transport() {
        return this.transport;
    }

    private MediaGraphRtspSourceResponse() {}

    private MediaGraphRtspSourceResponse(MediaGraphRtspSourceResponse $) {
        this.endpoint = $.endpoint;
        this.name = $.name;
        this.odataType = $.odataType;
        this.transport = $.transport;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MediaGraphRtspSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MediaGraphRtspSourceResponse $;

        public Builder() {
            $ = new MediaGraphRtspSourceResponse();
        }

        public Builder(MediaGraphRtspSourceResponse defaults) {
            $ = new MediaGraphRtspSourceResponse(Objects.requireNonNull(defaults));
        }

        public Builder endpoint(Either<MediaGraphClearEndpointResponse,MediaGraphTlsEndpointResponse> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder transport(String transport) {
            $.transport = transport;
            return this;
        }

        public MediaGraphRtspSourceResponse build() {
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            $.transport = Objects.requireNonNull($.transport, "expected parameter 'transport' to be non-null");
            return $;
        }
    }

}
