// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 *  `Any` contains an arbitrary serialized protocol buffer message along with a URL that describes the type of the serialized message. Protobuf library provides support to pack/unpack Any values in the form of utility functions or additional generated methods of the Any type. Example 1: Pack and unpack a message in C++. Foo foo = ...; Any any; any.PackFrom(foo); ... if (any.UnpackTo(&amp;foo)) { ... } Example 2: Pack and unpack a message in Java. Foo foo = ...; Any any = Any.pack(foo); ... if (any.is(Foo.class)) { foo = any.unpack(Foo.class); } Example 3: Pack and unpack a message in Python. foo = Foo(...) any = Any() any.Pack(foo) ... if any.Is(Foo.DESCRIPTOR): any.Unpack(foo) ... Example 4: Pack and unpack a message in Go foo := &amp;pb.Foo{...} any, err := ptypes.MarshalAny(foo) ... foo := &amp;pb.Foo{} if err := ptypes.UnmarshalAny(any, foo); err != nil { ... } The pack methods provided by protobuf library will by default use &#39;type.googleapis.com/full.type.name&#39; as the type URL and the unpack methods only use the fully qualified type name after the last &#39;/&#39; in the type URL, for example &#34;foo.bar.com/x/y.z&#34; will yield type name &#34;y.z&#34;. # JSON The JSON representation of an `Any` value uses the regular representation of the deserialized, embedded message, with an additional field `@type` which contains the type URL. Example: package google.profile; message Person { string first_name = 1; string last_name = 2; } { &#34;@type&#34;: &#34;type.googleapis.com/google.profile.Person&#34;, &#34;firstName&#34;: , &#34;lastName&#34;: } If the embedded message type is well-known and has a custom JSON representation, that representation will be embedded adding a field `value` which holds the custom JSON in addition to the `@type` field. Example (for message google.protobuf.Duration): { &#34;@type&#34;: &#34;type.googleapis.com/google.protobuf.Duration&#34;, &#34;value&#34;: &#34;1.212s&#34; }
 * 
 */
public final class AnyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnyArgs Empty = new AnyArgs();

    /**
     * A URL/resource name that uniquely identifies the type of the serialized protocol buffer message. This string must contain at least one &#34;/&#34; character. The last segment of the URL&#39;s path must represent the fully qualified name of the type (as in `path/google.protobuf.Duration`). The name should be in a canonical form (e.g., leading &#34;.&#34; is not accepted). In practice, teams usually precompile into the binary all types that they expect it to use in the context of Any. However, for URLs which use the scheme `http`, `https`, or no scheme, one can optionally set up a type server that maps type URLs to message definitions as follows: * If no scheme is provided, `https` is assumed. * An HTTP GET on the URL must yield a google.protobuf.Type value in binary format, or produce an error. * Applications are allowed to cache lookup results based on the URL, or have them precompiled into a binary to avoid any lookup. Therefore, binary compatibility needs to be preserved on changes to types. (Use versioned type names to manage breaking changes.) Note: this functionality is not currently available in the official protobuf release, and it is not used for type URLs beginning with type.googleapis.com. Schemes other than `http`, `https` (or the empty scheme) might be used with implementation specific semantics.
     * 
     */
    @Import(name="typeUrl")
    private @Nullable Output<String> typeUrl;

    public Optional<Output<String>> typeUrl() {
        return Optional.ofNullable(this.typeUrl);
    }

    /**
     * Must be a valid serialized protocol buffer of the above specified type.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private AnyArgs() {}

    private AnyArgs(AnyArgs $) {
        this.typeUrl = $.typeUrl;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnyArgs $;

        public Builder() {
            $ = new AnyArgs();
        }

        public Builder(AnyArgs defaults) {
            $ = new AnyArgs(Objects.requireNonNull(defaults));
        }

        public Builder typeUrl(@Nullable Output<String> typeUrl) {
            $.typeUrl = typeUrl;
            return this;
        }

        public Builder typeUrl(String typeUrl) {
            return typeUrl(Output.of(typeUrl));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AnyArgs build() {
            return $;
        }
    }

}
