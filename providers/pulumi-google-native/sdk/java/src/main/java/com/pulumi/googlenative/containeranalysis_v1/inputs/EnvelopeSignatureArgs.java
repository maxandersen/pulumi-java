// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvelopeSignatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvelopeSignatureArgs Empty = new EnvelopeSignatureArgs();

    @Import(name="keyid")
    private @Nullable Output<String> keyid;

    public Optional<Output<String>> keyid() {
        return Optional.ofNullable(this.keyid);
    }

    @Import(name="sig")
    private @Nullable Output<String> sig;

    public Optional<Output<String>> sig() {
        return Optional.ofNullable(this.sig);
    }

    private EnvelopeSignatureArgs() {}

    private EnvelopeSignatureArgs(EnvelopeSignatureArgs $) {
        this.keyid = $.keyid;
        this.sig = $.sig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvelopeSignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvelopeSignatureArgs $;

        public Builder() {
            $ = new EnvelopeSignatureArgs();
        }

        public Builder(EnvelopeSignatureArgs defaults) {
            $ = new EnvelopeSignatureArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyid(@Nullable Output<String> keyid) {
            $.keyid = keyid;
            return this;
        }

        public Builder keyid(String keyid) {
            return keyid(Output.of(keyid));
        }

        public Builder sig(@Nullable Output<String> sig) {
            $.sig = sig;
            return this;
        }

        public Builder sig(String sig) {
            return sig(Output.of(sig));
        }

        public EnvelopeSignatureArgs build() {
            return $;
        }
    }

}
