// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A unique identifier for the type of message. Display_name is intended to be human-readable, code is intended to be machine readable. There should be a one-to-one mapping between display_name and code. (i.e. do not re-use display_names or codes between message types.) See istio.analysis.v1alpha1.AnalysisMessageBase.Type
 * 
 */
public final class ServiceMeshTypeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceMeshTypeResponse Empty = new ServiceMeshTypeResponse();

    /**
     * A 7 character code matching `^IST[0-9]{4}$` or `^ASM[0-9]{4}$`, intended to uniquely identify the message type. (e.g. &#34;IST0001&#34; is mapped to the &#34;InternalError&#34; message type.)
     * 
     */
    @Import(name="code", required=true)
    private String code;

    public String code() {
        return this.code;
    }

    /**
     * A human-readable name for the message type. e.g. &#34;InternalError&#34;, &#34;PodMissingProxy&#34;. This should be the same for all messages of the same type. (This corresponds to the `name` field in open-source Istio.)
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    public String displayName() {
        return this.displayName;
    }

    private ServiceMeshTypeResponse() {}

    private ServiceMeshTypeResponse(ServiceMeshTypeResponse $) {
        this.code = $.code;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceMeshTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceMeshTypeResponse $;

        public Builder() {
            $ = new ServiceMeshTypeResponse();
        }

        public Builder(ServiceMeshTypeResponse defaults) {
            $ = new ServiceMeshTypeResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        public ServiceMeshTypeResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
