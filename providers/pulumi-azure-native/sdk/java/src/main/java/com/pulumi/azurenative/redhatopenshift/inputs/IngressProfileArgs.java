// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressProfile represents an ingress profile.
 * 
 */
public final class IngressProfileArgs extends ResourceArgs {

    public static final IngressProfileArgs Empty = new IngressProfileArgs();

    /**
     * The IP of the ingress (immutable).
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return The IP of the ingress (immutable).
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * The ingress profile name.  Must be &#34;default&#34; (immutable).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The ingress profile name.  Must be &#34;default&#34; (immutable).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Ingress visibility (immutable).
     * 
     */
    @Import(name="visibility")
    private @Nullable Output<String> visibility;

    /**
     * @return Ingress visibility (immutable).
     * 
     */
    public Optional<Output<String>> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    private IngressProfileArgs() {}

    private IngressProfileArgs(IngressProfileArgs $) {
        this.ip = $.ip;
        this.name = $.name;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressProfileArgs $;

        public Builder() {
            $ = new IngressProfileArgs();
        }

        public Builder(IngressProfileArgs defaults) {
            $ = new IngressProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ip The IP of the ingress (immutable).
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip The IP of the ingress (immutable).
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param name The ingress profile name.  Must be &#34;default&#34; (immutable).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The ingress profile name.  Must be &#34;default&#34; (immutable).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param visibility Ingress visibility (immutable).
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable Output<String> visibility) {
            $.visibility = visibility;
            return this;
        }

        /**
         * @param visibility Ingress visibility (immutable).
         * 
         * @return builder
         * 
         */
        public Builder visibility(String visibility) {
            return visibility(Output.of(visibility));
        }

        public IngressProfileArgs build() {
            return $;
        }
    }

}
