// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the clip time as an absolute time position in the media file.  The absolute time can point to a different position depending on whether the media file starts from a timestamp of zero or not.
 * 
 */
public final class AbsoluteClipTimeResponse extends com.pulumi.resources.InvokeArgs {

    public static final AbsoluteClipTimeResponse Empty = new AbsoluteClipTimeResponse();

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.AbsoluteClipTime&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * The time position on the timeline of the input media. It is usually specified as an ISO8601 period. e.g PT30S for 30 seconds.
     * 
     */
    @Import(name="time", required=true)
    private String time;

    public String time() {
        return this.time;
    }

    private AbsoluteClipTimeResponse() {}

    private AbsoluteClipTimeResponse(AbsoluteClipTimeResponse $) {
        this.odataType = $.odataType;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AbsoluteClipTimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AbsoluteClipTimeResponse $;

        public Builder() {
            $ = new AbsoluteClipTimeResponse();
        }

        public Builder(AbsoluteClipTimeResponse defaults) {
            $ = new AbsoluteClipTimeResponse(Objects.requireNonNull(defaults));
        }

        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder time(String time) {
            $.time = time;
            return this;
        }

        public AbsoluteClipTimeResponse build() {
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            $.time = Objects.requireNonNull($.time, "expected parameter 'time' to be non-null");
            return $;
        }
    }

}
