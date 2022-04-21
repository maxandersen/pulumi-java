// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * The `Status` type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data: error code, error message, and error details. You can find out more about this error model and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).
 * 
 */
public final class StatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final StatusResponse Empty = new StatusResponse();

    /**
     * The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    @Import(name="code", required=true)
    private Integer code;

    public Integer code() {
        return this.code;
    }

    /**
     * A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    @Import(name="details", required=true)
    private List<Map<String,String>> details;

    public List<Map<String,String>> details() {
        return this.details;
    }

    /**
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    public String message() {
        return this.message;
    }

    private StatusResponse() {}

    private StatusResponse(StatusResponse $) {
        this.code = $.code;
        this.details = $.details;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusResponse $;

        public Builder() {
            $ = new StatusResponse();
        }

        public Builder(StatusResponse defaults) {
            $ = new StatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(Integer code) {
            $.code = code;
            return this;
        }

        public Builder details(List<Map<String,String>> details) {
            $.details = details;
            return this;
        }

        public Builder details(Map<String,String>... details) {
            return details(List.of(details));
        }

        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public StatusResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.details = Objects.requireNonNull($.details, "expected parameter 'details' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}
